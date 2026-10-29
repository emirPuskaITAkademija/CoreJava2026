package com.academy.seven.oop.human;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String nin;

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
}
