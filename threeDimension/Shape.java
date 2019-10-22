package com.company.threeDimension;

abstract public class Shape implements Comparable<Shape> {

    public double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(o.volume, volume);
    }
}
