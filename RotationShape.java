package com.company.threeDimension;

import com.company.threeDimension.Shape;

public class RotationShape extends Shape {

    public double radius;

    public RotationShape(double r, double volume) {
        super(volume);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

}
