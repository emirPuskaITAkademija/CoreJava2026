package com.academy.eight.vehicle;

import com.academy.eight.Flyable;

public class Plane extends Vozilo implements Flyable {
    @Override
    public void pokreni() {
        System.out.println("Pokrećem avion..");
    }

    @Override
    public void fly() {
        System.out.println("Ja sam AVION koji leti na motorni pogon...");
    }

    @Override
    public void drive() {
        fly();
    }
}
