package lab9;

public class Duck extends Bird implements Movable {

    public Duck(String name) {
        super(name);
    }
    public void makeNest(){
        System.out.println("Duck make nest");
    }
    @Override
    public void move() {
        System.out.println("Duck is moving");
    }
}
