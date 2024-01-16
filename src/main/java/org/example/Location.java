package org.example;

public class Location {
    Location(Double x,Double y){
        this.x=x;
        this.y=y;
    }
    private Double x;
    private Double y;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getLocation(){
        return "("+x+","+y+")";
    }

}
