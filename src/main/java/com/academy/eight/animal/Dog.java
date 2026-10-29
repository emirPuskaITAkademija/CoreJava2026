package com.academy.eight.animal;

public class Dog extends Animal {
    public Dog() {
        super("Pas");
    }

    @Override
    public void playSound() {
        System.out.println("Waw waw...");
    }
}
