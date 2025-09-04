package lab3;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle(0,1));
        vehicles.add(new Vehicle(0,2));
        vehicles.add(new Vehicle(0,3));

        for(Vehicle j : vehicles)
        {
            System.out.println(j.getDetails());
        }
        Random rand = new Random();
        boolean raceOver = false;

        while(!raceOver)
        {


            for(Vehicle v :  vehicles)
            {
                int n = rand.nextInt(10) + 1;
                v.accelerate(n);

                if(v.distanceTravelled > 1000)
                {
                    raceOver = true;
                }
                System.out.println(v.getDetails());
            }
            //speed condition should be adjusted

        }
    }
}
