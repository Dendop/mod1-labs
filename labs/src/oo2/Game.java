package oo2;

import lab4.ShapeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game extends Canvas {
      private ArrayList<Shape> shapes;
//    private Shape[] shapes;  // Array of balls

    public Game() {
        // Set world dimensions for all balls
        Shape.setWorld(300, 300);
        shapes = new ArrayList<Shape>();
        // Create 3 balls

        shapes.add(new Shape(50, 50, 20, 20, 2, 3, ShapeType.ROUNDRECTANGLE));
        shapes.add(new Shape(100, 150, 30, 30));
        shapes.add(new Shape(200, 100, 25, 25, -2, 1, ShapeType.OVAL));
//        shapes = new Shape[] {
//                new Shape(50, 50, 20, 20, 2, 3, ShapeType.ROUNDRECTANGLE),
//                new Shape(100, 150, 30, 30), // uses default OVAL type
//                new Shape(200, 100, 25, 25, -2, 1, ShapeType.OVAL)
//        };

        JFrame frame = new JFrame("Bouncing Balls");
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        // Timer for animation
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };
        t.schedule(tt, 0, 50);

        // Stop timer on window close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void draw() {
        for (Shape b : shapes) {
            b.move();
        }
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        // Draw world rectangle



        // Draw each ball
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    public static void main(String[] args) {
        new Game(); // Start the game
    }
}