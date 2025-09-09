package lab7;

import java.awt.*;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {
        Sphere sp = new Sphere(Color.RED,new Point(3,2),3.00);
        Rectangle rec = new Rectangle(Color.GREEN,new Point(4,1),3.2,2.0);
        Circle c = new Circle(Color.YELLOW,new Point(2,4),2);



        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(sp);
        shapes.add(rec);
        shapes.add(c);

        for(Shape x : shapes){

           x.printCharacteristics();
        }


    }
}
