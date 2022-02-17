package com.company;

import java.awt.*;
import java.util.ArrayList;


public class Ball /*implements Runnable*/ {

    private double x = 1;
    private double y=1;
    private double diameter;
    private Color color;
    private int deltaX = 2;
    private int deltaY = 2;

    public Ball() {
        setDiameter(20);
        setColor(Color.BLUE);
    }

    /*@Override
    public void run() {
        int randomDelay = (int)(Math.random());
        while (true){
            move();
            bouncingBallPanel.repaint();
            try {
                Thread.sleep(randomDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    public void move() {

        x = x + deltaX;
        y = y + deltaY;
        double panelWidth = 400;
        double panelHeight = 400;

        if (x > panelWidth) {
            deltaX = -deltaX; // cause ball to move in opposite x direction
        }
        if (y > panelHeight) {
            deltaY = -deltaY;// cause ball to move in opposite y direction

        }
    }
}
