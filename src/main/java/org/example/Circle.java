package org.example;

public class Circle extends Shape {
    private Double radious;

    Circle(Location loc,Double radious){
        super(loc);
        this.radious = radious;
    }

    @Override
    public String toString() {
        return "Circle radious = "+radious+" and Location is "+getLoc().getLocation();
    }

    @Override
    public Double area() {
        return (Math.pow(radious,2)*Math.PI);
    }

    @Override
    public Double perimeter() {
        return (radious*2*Math.PI);
    }

}
