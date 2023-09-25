package com.workintech.Silindir;

public class Cylinder {

    private double height;


    public Cylinder(double height) {
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }


}
