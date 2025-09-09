package lab9;

public abstract class Animal {
    private AnimalType animalType;
    private String name;

    public Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;

    }
    public AnimalType getAnimalType() {
        return this.animalType;
    }
    public String getName(){
        return this.name;
    }
}
