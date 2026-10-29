package com.academy.eight.vehicle;

public class Biciklo extends Vozilo{
    @Override
    public void pokreni() {
        System.out.println("Pokrećem biciklo..");
    }

    @Override
    public void drive() {
        System.out.println("Drive biciklo..");
    }
}
