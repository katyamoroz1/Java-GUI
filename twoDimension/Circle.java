package com.company.twoDimension;

import com.company.twoDimension.Figure;

public class Circle  extends Figure {

    public double r;

    public Circle (double r) {
        super(Math.PI * Math.pow(r, 2));
        this.r = r;
    }
}
