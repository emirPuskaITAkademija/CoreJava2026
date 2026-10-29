package com.academy.eight.animal;

public class Cat extends Animal {
    public Cat() {
        super("Mačka");
    }

    @Override
    public void playSound() {
        System.out.println("mjau mjau mjau...");
    }
}
