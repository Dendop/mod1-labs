package lab9;

public class Fish extends Animal implements Swimmable{

    public Fish(String name) {
        super(AnimalType.Fish, name);
    }
    @Override
    public void swim(){
        System.out.println("Fish swim, from interface");
    }


}
