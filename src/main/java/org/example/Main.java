package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Location loc = new Location(1D,2D);
        Circle c = new Circle(loc,2.5);
        System.out.println("Circle area is "+c.area());
        System.out.println("Circle perimeter is "+c.perimeter());
        System.out.println(c.toString());

        Rectangle r = new Rectangle(4D,2D,loc);
        System.out.println("Rectangle area is "+r.area());
        System.out.println("Rectangle perimeter is "+r.perimeter());
        System.out.println(r.toString());
    }
}