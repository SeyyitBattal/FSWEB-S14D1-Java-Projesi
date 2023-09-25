package com.workintech.Silindir;

public class Circle extends Cylinder {
    private double radius;


    private Circle(double height, double radius){
        super(height);
        this.radius = radius;
    }


    public double getArea (double radius){
        return (Math.pow(radius,2) * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }


}
