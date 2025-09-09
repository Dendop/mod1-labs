package lab7;

import java.awt.*;

public class Circle extends Shape {

    private double radius;

    public Circle(Color color, Point position, double radius)
    {
        super(color,position);
        this.radius = radius;
    }



    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircimference(){
        return 2 * Math.PI * radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void printCharacteristics()
    {
        System.out.println("Shape: Circle" +
                           " Color: " + getColor() +
                           " Position: " + getPosition() +
                           " Radius: " +  getRadius());
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
