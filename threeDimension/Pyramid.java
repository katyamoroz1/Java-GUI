package com.company.threeDimension;

import com.company.threeDimension.Shape;

public class Pyramid extends Shape {

    private double square;
    private double h;

    public Pyramid (double square, double h) {
        super(1/3 * square * h);
        this.square = square;
        this.h = h;
    }
}
