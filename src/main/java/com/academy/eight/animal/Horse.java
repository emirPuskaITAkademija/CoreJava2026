package com.academy.eight.animal;

import com.academy.eight.Drivable;

public class Horse extends Animal implements Drivable {
    public Horse() {
        super("Konj");
    }

    @Override
    public void playSound() {
        System.out.println("Iiiihahh..");
    }

    @Override
    public void drive() {
        System.out.println("Drajvam konja...i manje troši moj dorat od bilo koeg automobila..");
    }
}
