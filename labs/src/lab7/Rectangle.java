package lab7;

import java.awt.*;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(Color color, Point position, double sideA, double sideB){
        super(color,position);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double getArea(){
        return this.sideA * this.sideB;
    }
    public double getCircumfence(){
        return 2 * (this.sideA + this.sideB);
    }
    public void printCharacteristics(){
        System.out.println("Shape: Rectangle"+
                            " Color: "+ getColor() +
                            " Position: "+ getPosition() +
                            " Area: " + getArea() +
                            " Circumference: " + getCircumfence());
    }
}
