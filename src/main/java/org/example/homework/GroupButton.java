package org.example.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupButton {

    private int activeButton;
    private List<Button> buttons;


    public GroupButton(List<Button> buttons) {
        this.buttons = buttons;
    }

    public GroupButton() {
        this.buttons = new ArrayList<>();
    }

    public void display(){
        this.buttons.forEach(e->
        {
            e.display();
        }
        );
    }

    public void setActiveButton(int activeButton) {
        this.buttons.get(activeButton).setActive(1);
        this.activeButton = activeButton;
    }

    public void add(Button b){
        this.buttons.add(b);
    }
}
