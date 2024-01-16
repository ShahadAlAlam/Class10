package org.example;

public class Rectangle extends Shape {
    Double side1, side2;

    Rectangle(Location loc){
        super(loc);
    }

    Rectangle(Double side1,Double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    Rectangle(Double side1,Double side2,Location loc){
        super(loc);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle side1 = "+side1+" and side2 = "+side1+" and Location = "+getLoc().getLocation();
    }

    @Override
    public Double area() {
        return (side1*side2);
    }

    @Override
    public Double perimeter() {
        return 2*(side1+side1);
    }

}
