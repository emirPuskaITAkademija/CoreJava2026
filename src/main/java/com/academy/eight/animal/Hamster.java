package com.academy.eight.animal;

public class Hamster extends Animal {
    public Hamster() {
        super("Hrčak");
    }

    @Override
    public void playSound() {
        System.out.println("Hrk Hrk Hrk...");
    }
}
