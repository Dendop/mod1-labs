package lab9;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(AnimalType.Bird, name);
    }
    public abstract void makeNest();
}
