package com.academy.eight.animal;

import com.academy.eight.Flyable;

public class Bird extends  Animal implements Flyable {
    public Bird() {
        super("Ptica");
    }

    @Override
    public void playSound() {
        System.out.println("ćiju ćiju tupp..");
    }

    @Override
    public void fly() {
        System.out.println("Ja sam ptica i letim,..");
    }
}
