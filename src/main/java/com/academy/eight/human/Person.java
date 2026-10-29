package com.academy.eight.human;

import com.academy.eight.animal.Animal;
import com.academy.eight.animal.Fish;
import com.academy.eight.animal.Hamster;
import com.academy.eight.vehicle.Vozilo;

import java.time.LocalDate;
import java.time.Period;
//Person HAS-A name
//Person HAS-A surname
//Person HAS-A bithday
//Person HAS-A fish  Person <-> Animal : Klasa Person zavisi/depends od klase Animal
public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String nin;
    private Vozilo vozilo;

    private Animal animal;

    public Person(String name, String surname, LocalDate birthday, String nin) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.nin = nin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int years = period.getYears();
        return years;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }
}
