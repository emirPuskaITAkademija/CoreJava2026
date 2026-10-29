package com.academy.eight;

import com.academy.eight.animal.*;
import com.academy.eight.human.Penzioner;
import com.academy.eight.human.Profesor;
import com.academy.eight.human.Student;
import com.academy.eight.vehicle.Motocikl;
import com.academy.eight.vehicle.Vozilo;

import java.time.LocalDate;
import java.util.Calendar;

public class Demo {
    static void main() {
//        Animal animal = new Animal("Lesi");
//        animal.playSound();

        //tipa: Fish, Animal
        Fish fish1 = new Fish();
        Profesor profesor = new Profesor("Dušan", "Milosavljević", LocalDate.of(1990, 1, 1), "dsmksd");
        profesor.setAnimal(fish1);

        //hmaster1: Hamster, Animal
        Hamster hamster1 = new Hamster();
        profesor.setAnimal(hamster1);


        Student student = new Student("Nemanja", "Cvetković", LocalDate.of(2000, 1, 1), "smdksm", "2323");
        student.setAnimal(fish1);
        System.out.println(profesor.getName() + " HAS-A " + profesor.getAnimal().getType());

        Penzioner danijel = new Penzioner("Danijel", "Borojević", LocalDate.of(1990, 1, 1), "dsds", 2300.0);

        Cat cat = new Cat();
        danijel.setAnimal(cat);

        Caw caw = new Caw();
        danijel.setAnimal(caw);
        System.out.println(danijel.getName() + " HAS-A " + danijel.getAnimal().getType());

        //motocikl: Motocikl, Vozilo
        Vozilo motocikl = new Motocikl();
        Student student1 = new Student("Filip", "Prvulović", LocalDate.of(1990, 1, 1), "dsmksm", "2323");
        student1.setVozilo(motocikl);

    }
}
