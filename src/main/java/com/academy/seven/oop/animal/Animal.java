package com.academy.seven.oop.animal;


//Animal animal1 = new Animal("Lesi")
//animal1.playSound();
//Animal animal2 = new Dog("Lesi")
//animal2.playSoung();
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playSound();
}
