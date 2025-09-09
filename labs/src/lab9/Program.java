package lab9;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Fish("George"));
        animals.add(new Duck("Mark"));

        for(Animal a : animals){
            a.getAnimalType();
            a.getName();
            if(a instanceof Duck){
                ((Duck) a).makeNest();
                System.out.println(a.getName());
                System.out.println(a.getAnimalType());
            }
            if(a instanceof Fish){
                ((Fish) a).swim();
            }
        }

        System.out.println("Interfaces: ");
        for(Animal x :  animals)
        {
            if(x instanceof Movable)
            {
                ((Movable) x).move();
            }
            if(x instanceof Swimmable){
                ((Swimmable) x).swim();
            }
        }

    }
}
