package org.example.homework;

public class GridButton extends Button{


    public GridButton(float x, float y) {
        super(x, y, "");
    }

    @Override
    void display() {
        System.out.println(toString());
    }

    @Override
    void clicked(int x, int y) {
        System.out.println("GridButton clicked"+x+", "+y+")");
    }

    @Override
    public String toString() {
        return "GridButton "+(getActive()==1?"(Active) ":" ")+getLabel();
    }
}
