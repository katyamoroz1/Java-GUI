package com.company.threeDimension;

public class Cylinder extends RotationShape {

    public double hight;

    public Cylinder(double r, double hight) {
        super(r, Math.pow(r, 2) * Math.PI * hight);
        this.hight = hight;
    }
}
