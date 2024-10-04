package chapter_9;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x,int y,int width ,int height){
        setLocation(x, y);
        setSize(width, height);
        //super(x,y,width,height);
    }
    public double getArea(){
        return getWidth() * getHeight();
    }
    public double getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }

    public static void main(String[] args) {
        BetterRectangle rectangle = new BetterRectangle(2,3,5,6);
        System.out.println("area :" +rectangle.getArea());
        System.out.println("perimeter : "+rectangle.getPerimeter());
    }
}
