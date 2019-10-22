package com.company.twoDimension;

import com.company.twoDimension.Figure;

public class Triangle extends Figure {

    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        super(Math.sqrt(((a + b + c) / 2)*(((a + b + c) / 2) - a)* (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c )));
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
