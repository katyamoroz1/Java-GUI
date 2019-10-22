package com.company;

import com.company.threeDimension.Parallelepiped;
import com.company.threeDimension.Pyramid;
import com.company.threeDimension.Taper;
import com.company.twoDimension.Circle;
import com.company.twoDimension.Rectangle;
import com.company.twoDimension.Triangle;

public class Converter {

    public static Taper convert(Circle figure) {
       return new Taper(figure.r,5);
    }

    public static Pyramid convert(Triangle figure) {
        return new Pyramid (figure.area, 5);
    }

    public static Parallelepiped convert(Rectangle figure) {
        return new Parallelepiped(figure.a, figure.a, 5);
    }
}
