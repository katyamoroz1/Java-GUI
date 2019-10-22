package com.company.threeDimension;


import com.company.threeDimension.RotationShape;

public class Sphere extends RotationShape {

    private double r;

    public Sphere(double r) {
        super(r, Math.pow(r, 3) * 4  * Math.PI / 3);
        this.r = r;
    }
}
