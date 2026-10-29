package com.academy.eight.vehicle;

public class Automobil extends Vozilo {
    @Override
    public void pokreni() {
        System.out.println("Pokrećem automobil..");
    }

    @Override
    public void drive() {
        System.out.println("Drive automobil..");
    }
}
