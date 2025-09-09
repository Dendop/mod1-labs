package lab8;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }
    public void accelerate(int seconds){
        this.speed += (5 * seconds);
    }
    public String getModel(){
        return this.model;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void getToSixty(){
        this.speed = 60;
    }
    public void printCar(){
        System.out.println("Car model: " + getModel());
        System.out.println("Car speed: " + getSpeed());
    }
}
