package lab8;

import java.util.ArrayList;

public class Program {

    static void processCars(ArrayList<Car> cars) {
        //gettosixty
        //accelerate 2 seconds
        //print
        for(Car c : cars){
            if(c instanceof RacingCar){
                RacingCar rc = (RacingCar)c;
                rc.setDriver("Mark");
                rc.setTurboFactor(2);
                rc.getToSixty();
                rc.accelerate(2);
                rc.printCar();
            }
            else {
                c.setModel("Ford");
                c.getToSixty();
                c.accelerate(2);
                c.printCar();
            }

        }

    }

    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<Car>();

        //if is not instance of racing car
        cars.add(new Car("",0));


        //if isinstance of RacingCar
        cars.add(new RacingCar("",0,"",0));



        processCars(cars);
    }
}
