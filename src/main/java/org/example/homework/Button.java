package org.example.homework;

import java.awt.*;

public abstract class Button {
    float x,y;

    private int active;
    private Color defaultColor;
    private Color selectedColor;

    private String label;

    private boolean selected;

    public Button() {
    }

    public Button(float x, float y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.active = 0;
    }

    abstract void display();
    abstract void clicked(int x, int y);

    public Color getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(Color defaultColor) {
        this.defaultColor = defaultColor;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
