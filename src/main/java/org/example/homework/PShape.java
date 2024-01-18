package org.example.homework;

import org.example.Location;

public class PShape {
    float w,h;


    public PShape(float w, float h) {
        this.w = w;
        this.h = h;
    }


    @Override
    public String toString() {
        return "PShape{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
