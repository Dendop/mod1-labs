package lab7;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private Point position;

    public Shape(Color color, Point position){
        this.color = color;
        this.position = position;
    }
    public Color getColor(){
        return this.color;
    }
    public Point getPosition(){
        return this.position;
    }
    public void setColor(Color col)
    {
        this.color = col;
    }
    public void setPosition(Point pos){
        this.position = pos;
    }
    public void printCharacteristics(){

    }
}
