package com.company.threeDimension;


public class Taper extends RotationShape {

    public double hight;

    public Taper(double radius, double hight) {
        super(radius, Math.pow(radius, 2) * Math.PI * hight / 3.);
        this.hight = hight;
    }
}
