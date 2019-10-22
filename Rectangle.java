package com.company.twoDimension;

import com.company.twoDimension.Figure;

public class Rectangle extends Figure {

    public double a;

    public Rectangle(double a) {
        super(a * a);
        this.a = a;
    }
}
