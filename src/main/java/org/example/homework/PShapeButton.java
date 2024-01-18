package org.example.homework;

public class PShapeButton extends Button{

    private PShape shape;

    public PShapeButton(float x, float y, PShape shape) {
        super(x, y, "PShapeButton");
        this.shape = shape;
    }

    @Override
    void display() {
        System.out.println("PShapeButton "+(getActive()==1?"(Active) ":" ")+getLabel()+" img="+this.shape.toString());
    }

    @Override
    void clicked(int x, int y) {
        System.out.println(getLabel()+" clicked ("+x+", "+y+")");
    }

    @Override
    public String toString() {
        return "PShapeButton "+getLabel();
    }
}
