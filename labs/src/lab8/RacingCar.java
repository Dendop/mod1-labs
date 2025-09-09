package lab8;

public class RacingCar extends Car{
    private String driver;
    private int turboFactor;

    public RacingCar(String model, int speed, String driver, int turboFactor){
        super(model, speed);
        this.driver = driver;
        this.turboFactor = turboFactor;
    }

    @Override
    public void accelerate(int seconds){
         super.accelerate(seconds);

         int boosted  = getSpeed() * getTurboFactor();
         setSpeed(boosted);
    }
    public String getDriver(){
        return this.driver;
    }
    public int getTurboFactor(){
        return this.turboFactor;
    }
    public void setDriver(String driver){
        this.driver = driver;
    }
    public void setTurboFactor(int turbofactor){
        this.turboFactor = turbofactor;
    }
    @Override
    public void printCar(){
        System.out.println("Model: " + getModel());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Driver: " + getDriver());
        System.out.println("Turbo Factor: " + getTurboFactor());
    }

}
