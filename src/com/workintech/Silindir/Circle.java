package com.workintech.Silindir;

public class Circle {
    private double radius;

    private Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
           this.radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double getArea (double radius){
        return (Math.pow(radius,2) * Math.PI);
    }



}
