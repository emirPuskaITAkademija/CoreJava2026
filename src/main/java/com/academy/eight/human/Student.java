package com.academy.eight.human;

import java.time.LocalDate;

public class Student extends Person {

    private String indexNumber;

    public Student(String name, String surname, LocalDate birthday, String nin, String indexNumber) {
        super(name, surname, birthday, nin);
        this.indexNumber = indexNumber;
    }


    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static void print(){
        System.out.println("Ja sam statička funkcija i ne pripadam objektu kreiranom po šablonu klase Student..");
    }
}
