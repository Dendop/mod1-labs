package oo2;

import lab4.ShapeType;

import java.awt.Graphics;

public class Shape {
    public int x, y, w, h;
    private int dirX, dirY;
    private ShapeType shapeType;

    // Static world dimensions
    public static int worldW = 300;
    public static int worldH = 300;

    // Full constructor
    public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
        this.shapeType = shapeType;
    }
    public ShapeType getShapeType(){
        return shapeType;
    }

    // Constructor chaining: default dirX and dirY = 1
    public Shape(int x, int y, int w, int h) {
        this(x, y, w, h, 1, 1, ShapeType.OVAL);
    }

    // Move the ball and bounce off walls
    public void move() {
        x += dirX;
        y += dirY;

        if (x < 0) { x = 0; dirX = -dirX; }
        if (y < 0) { y = 0; dirY = -dirY; }
        if (x > worldW - w) { x = worldW - w; dirX = -dirX; }
        if (y > worldH - h) { y = worldH - h; dirY = -dirY; }
    }

    // Draw the ball
    public void draw(Graphics g) {
        switch (shapeType) {
            case OVAL:
                g.fillOval(x, y, w, h);
                break;
            case ROUNDRECTANGLE:
                g.fillRoundRect(x, y, w, h, 10, 10); // example corner arcs
                break;
        }
    }

    // Static method to set world dimensions
    public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }
}
