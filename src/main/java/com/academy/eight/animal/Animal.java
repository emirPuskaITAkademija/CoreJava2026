package com.academy.eight.animal;

public abstract class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract void playSound();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
