package com.academy.eight.animal;

public class Fish extends Animal {
    public Fish() {
        super("Riba");
    }

    @Override
    public void playSound() {
        System.out.println("Brlp Brlp ...");
    }
}
