package lab3;

public class Vehicle {
    public int speed;
    public int lane;
    public int distanceTravelled;
    public RegistrationPlate regPlate;

    public Vehicle(int speed, int lane)
    {
        this.speed = speed;
        this.lane = lane;
        this.regPlate = RegistrationPlateFactory.getNextRegistrationPlate();
        this.distanceTravelled = 0;
    }
    public void accelerate(int amount){
        speed += amount;
        distanceTravelled += amount;

    }
    public void brake(int amount){
        speed -= amount;
    }
    public String getDetails(){
        return String.format("Speed: " + speed + " Lane: "+lane + " Distance Travelled: " + distanceTravelled + " Plate: " + regPlate);
    }
}
