package com.academy.seven.oop.human;

import java.time.LocalDate;

public class Demo {

    static void main(String[] args) {
        Person filip = new Person("Filip", "Prvulović", LocalDate.now(), "12213mksfd");

        Penzioner nemanja = new Penzioner("Nemanja", "Cvetković", LocalDate.of(1960, 1, 1), "12sdssds");
        nemanja.setPensionAmount(2500.0);
        System.out.println(nemanja.getAge() + " godina");

        //profesor objekat je tipa Profesor, Person
        Profesor profesor = new Profesor("Nemanja", "Stojković", LocalDate.of(1980, 1, 1), "2324df2332");
        profesor.setSalary(5000.0);
        System.out.println(profesor.getName() + " ima " + profesor.getAge() + " godina");

        Student student = new Student("Emir", "Puška", LocalDate.of(1988, 1, 1), "15055wds", "15055");
        System.out.println(student.getName() + " ima " + student.getAge() + " godina");

    }
}
