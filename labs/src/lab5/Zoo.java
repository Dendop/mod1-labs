package lab5;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private HashMap<String, Integer> animalMap;

    public Zoo()
    {
        animalMap = new HashMap<>();
        String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
        String[] newAnimals = {"Zebra","Gazelle","Buffalo","Zebra"};

        addAnimals(originalAnimals);
        addAnimals(newAnimals);

        displayAnimalData();
    }
    public void addAnimals(String[] animals){
        for(String animal : animals){
            if(!animalMap.containsKey(animal)){
                animalMap.put(animal, 1);
            }
            else {
                int curVal = animalMap.get(animal);
                animalMap.put(animal, curVal + 1);
            }
        }


    }
    public void displayAnimalData()
    {
        for(Map.Entry<String,Integer> x : animalMap.entrySet())
                {
                    System.out.println(x.getKey() + ": " + x.getValue());
                }
    }

}

