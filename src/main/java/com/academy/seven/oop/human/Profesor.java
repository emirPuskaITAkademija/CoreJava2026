package com.academy.seven.oop.human;

import java.time.LocalDate;

//Profesor IS-A Person
public class Profesor extends Person{

    private double salary;

    public Profesor(String name, String surname, LocalDate birthday, String nin) {
        super(name, surname, birthday, nin);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
