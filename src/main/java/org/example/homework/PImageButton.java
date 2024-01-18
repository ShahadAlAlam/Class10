package org.example.homework;

public class PImageButton extends Button{

    private PImage img;

    public PImageButton(float x, float y, PImage img) {
        super(x, y, "PImageButtonImage");
        this.img = img;
    }

    @Override
    void display() {
        System.out.println("PImageButton "+(getActive()==1?"(Active) ":" ")+getLabel()+" img="+this.img.toString());
    }

    @Override
    void clicked(int x, int y) {
        System.out.println(getLabel()+" clicked ("+x+", "+y+")");
    }

    @Override
    public String toString() {
        return "PImageButton "+getLabel();
    }
}
