package chapter9;

import chapter8.Circle;

public class Cylinder {
    Circle object = new Circle();
    private int radius;
    private int height;
    static float PI=3.1416f;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return PI*getRadius()*getRadius()*getHeight();
    }
    public double surfaceArea(){
        return 2*PI*getRadius()*(getHeight()+getRadius());
    }
}
