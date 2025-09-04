package lab3;

public class RegistrationPlate {
    private String number;

    public String getNumber(){
        return number;
    }
    public RegistrationPlate(String number){
        this.number = number;
    }
    @Override
    public String toString(){
        return number;
    }

}
