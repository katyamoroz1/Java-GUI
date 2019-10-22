package com.company.threeDimension;


import com.company.threeDimension.Shape;

public class Parallelepiped  extends Shape {

    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c) {
        super(a * b * c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
