package org.example;

public abstract class Shape {

    private Location loc;
    Shape(Location loc){
        this.loc=loc;
    }

    Shape(){

    }

    public abstract String toString();
    public abstract Double area();
    public abstract Double perimeter();

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
