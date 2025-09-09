package lab7;

import java.awt.*;

public class Sphere extends Circle {
    public Sphere(Color color, Point position, double radius){
        super(color,position,radius);
    }
    public double getVolume(){
        return (4.00 / 3.00) * Math.PI * Math.pow(getRadius(), 3);
    }
    public void printCharacteristics(){
        System.out.println("Shape: Sphere" +
                "Color: " + getColor() +
                " Position: " + getPosition() +
                " Radius: " + getRadius() +
                " Volume: " + getVolume());
    }
}
