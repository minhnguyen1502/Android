package com.example.view;

public class Icon {
    private int id;
    private String text;
    private boolean isSelected;

    public Icon(int id, String text) {
        this.id = id;
        this.text = text;
        isSelected = false;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
