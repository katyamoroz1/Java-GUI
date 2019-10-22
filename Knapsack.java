package com.company;

import com.company.threeDimension.Shape;

import java.util.ArrayList;
import java.util.Collections;

public class Knapsack {

    public double volume;
    public ArrayList<Shape> objects;

    public Knapsack (double volume_) {
        this.volume = volume_;
        this.objects= new ArrayList<Shape>();
    }

    public void add(Shape object) throws BagException {
        if (object.volume > this.volume)  {
            throw new BagException("Фигура не влезает в рюкзак");
        } else {
            this.volume -= object.volume;
            this.objects.add(object);
            Collections.sort(objects);
        }
    }

}
