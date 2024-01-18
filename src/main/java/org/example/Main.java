package org.example;

import org.example.homework.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        Location loc = new Location(1D,2D);
//        Circle c = new Circle(loc,2.5);
//        System.out.println("Circle area is "+c.area());
//        System.out.println("Circle perimeter is "+c.perimeter());
//        System.out.println(c.toString());
//
//        Rectangle r = new Rectangle(4D,2D,loc);
//        System.out.println("Rectangle area is "+r.area());
//        System.out.println("Rectangle perimeter is "+r.perimeter());
//        System.out.println(r.toString());
        GridButton gb = new GridButton(1.0f,2.0f);
        Color color = new Color(255,128,64);
        gb.setDefaultColor(color);

        PImage pi = new PImage("Image button image");
        PImageButton pib = new PImageButton(3.0f,4.0f,pi);
        pib.setDefaultColor(new Color(128,128,64));


        PShape ps = new PShape(1f,1f);
        PShapeButton psb = new PShapeButton(5f,6f,ps);
        psb.setDefaultColor(new Color(128,128,128));


        GroupButton groupButton = new GroupButton();
        groupButton.add(gb);
        groupButton.add(pib);
        groupButton.add(psb);
        groupButton.setActiveButton(1);

        groupButton.display();



    }
}