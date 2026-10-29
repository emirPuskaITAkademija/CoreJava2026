package com.academy.seven.oop.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Vaw Vaw..");
    }
}
