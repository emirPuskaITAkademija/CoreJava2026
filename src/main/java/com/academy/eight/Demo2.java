package com.academy.eight;

import com.academy.eight.animal.Bird;
import com.academy.eight.animal.Horse;
import com.academy.eight.human.Student;
import com.academy.eight.vehicle.Automobil;
import com.academy.eight.vehicle.Plane;

import java.time.LocalDate;

public class Demo2 {
    static void main() {
        Bird bird = new Bird();
        fly(bird);
        Plane plane = new Plane();
        fly(plane);


        drive(plane);
        Horse horse = new Horse();
        drive(horse);

        Automobil automobil = new Automobil();
        drive(automobil);

        Student.print();
        Student student = new Student("Nemanja", "Stojković", LocalDate.now(), "233432", "NS12435");
        student.setSurname("Ženino");
        student.setNin("smkams");
    }

    static void fly(Flyable flyable) {
        System.out.println("Flyable");
        flyable.fly();
    }

    static void drive(Drivable drivable) {
        System.out.println("Drivable");
        drivable.drive();
    }
}
