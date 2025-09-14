package ProjectA;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import java.time.*;

public class Main {
    public static List<Animal> animals = new ArrayList<>();
    //removed the HashMap and random
    //didn't see them in use
    //maybe for test purposes??
    public static void main(String[] args) throws InterruptedException {

        //initialization factory method, using switch for specie
        Animal a1 = AnimalFactory.create("Rex", Species.DOG);
        Animal a2 = AnimalFactory.create("Mittens", Species.CAT);
        Animal a3 = AnimalFactory.create("Flopsy", Species.RABBIT);
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        //create Worker objects to use it's methods
        //class method seems a bit clearer/more readable
        //than using sys print + calling methods
        HelperWorker hp = new HelperWorker();

        System.out.println("=== Starter App ===");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(333);
                System.out.println("[BG] did something probably important");
            } catch (InterruptedException ignored) {}
        });


        //Concurency
        //I will run the Animal methods and
        //workerhelper methods in new thread

        Thread t2 = new Thread(() -> {
            //remove instance check
            //iterate through list and call class method to do things
            for (Animal a : animals) {
                a.performActions();
            }

            //Worker methods
            hp.calculateTax(123.45,"UK");
            hp.saveAnimalsToFile("animals.json");
            hp.printReport(Arrays.asList("OK","WARN", "TODO"));
        });


        t1.start();
        t2.start();

        //the main thread will wait for my
        //threads to finish before exit
        t1.join();
        t2.join();




        //removed "helper" call function for string 'shadow'
        //this function wasn't doing anything specific just returned first two
        //characters from string that we have passed to it

        //I have also removed the 'Kennel' class object instantiation
        //together with the class
        //I didn't see the real purpose of this class
        //just storing the "dog" object with name and same address for all objects

    }

    enum Species {
        DOG, CAT, RABBIT, UNKNOWN
    }
}
//implementing enums in the class
//+adding new method for class that will do things
abstract class Animal implements Livable{
    public String name;
    public Main.Species species;
    public int legs;


    public Animal(String name) {
        this.name = name;
        this.legs = -1;
    }
    @Override
    public abstract void speak();

    @Override
    public void move() {
        System.out.println(name + " moves somehow on " + legs + " legs.");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }
    public void performActions(){
        speak();
        switch(species){
            case DOG -> System.out.println(this.name + " chases tail.");
            case CAT -> System.out.println(this.name + " ignores you.");
            case RABBIT -> System.out.println(this.name + " nibbles something?");
            default -> System.out.println(this.name + " does animal stuff.");
        }
        move();
        eat("food");
        System.out.println(); //adding newline
    }
}
//Must construct this specie for each subclass
class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.species = Main.Species.DOG;
        this.legs = 4;
    }
    @Override public void speak() { System.out.println(name + " says: woof"); }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.species = Main.Species.CAT;
        this.legs = 4;
    }
    @Override public void speak() { System.out.println(name + " says: meow"); }
}

class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
        this.species = Main.Species.RABBIT;
        this.legs = 4;
    }
    @Override public void speak() { System.out.println(name + " says: squeak"); }
}

//create object for each class depending on specie at initialization
class AnimalFactory{
    public static Animal create(String name, Main.Species species){
        return switch(species){
            case DOG -> new Dog(name);
            case CAT -> new Cat(name);
            case RABBIT -> new Rabbit(name);
            default -> throw new IllegalArgumentException("Specie does not exists");
        };
    }
}

class HelperWorker implements Workable{

    //I have changed the method to return 'void' instead of double
    //so we don't have to print in main class into console
    //but instead the function will print for us
    @Override
    public void calculateTax(double gross, String country) {

        double result = 0;
        switch(country.toUpperCase()){
            case "UK" -> result += gross * 0.2;
            case "FR" -> result += (gross * 0.19) + 3;
            default -> System.out.println("Invalid country.Usage: UK/FR");
        }
        System.out.println("Tax rough calc: " + result);
    }
    //I was not sure if I supposed to implement this method
    //to store the animal list into json file
    //or simply keep 'simulation' storing method that just prints
    @Override
    public void saveAnimalsToFile(String pathFile){
        Gson gson = new Gson();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile))){
            gson.toJson(Main.animals, bw); //hardcoded animal list
            bw.flush();
        }
        catch(Exception ex){
            System.out.println("Could not save the file");
            ex.printStackTrace();
        }

        System.out.println("Saving to " + pathFile + " ...");
    }

    @Override
    public void printReport(List<String> lines){
            System.out.println("Report:");
            System.out.println("---- REPORT ----");
            for (int i = 0; i < lines.size(); i = i + 1) {
                System.out.println((i+1) + ") " + lines.get(i));
            }
            System.out.println("Generated at: " + LocalDateTime.now());
        }
    }

//adding interface to force methods for each animal specie Interface <- Animal <- Child (override)
interface Livable{
    void speak();
    void move();
    void eat(String food);
}
//I am planning to create class "worker" that will implement methods
//for tax cal,'saving' file, printing report
//I would also include 'helper' method in this interface if
//it would do some real action
interface Workable{
    void calculateTax(double gross, String country);
    void printReport(List<String> lines);
    void saveAnimalsToFile(String pathFile);
}