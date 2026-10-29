package com.academy.eight.quiz;

public class Quiz4 {
    /**
     *
     * public class Student {
     *
     *     private String surname;
     *
     *     public void setSurname(String surname) {
     *         this.surname = surname;
     *     }
     * }
     *
     * Za navedenu klasu i uz pretpostavku da kod pozivamo iz druge klase koja naredba poziva setSurname
     *
     * A. Student nemanja = new Student(); nemanja.setSurname("Ženino");
     * B. new Student.setSurname("Ženino");
     * C. setSurname("Ženino"); bez postojanja objekta u statičkom main methodu
     * D. Student.setSurname("Ženino");
     *
     */

    static void main(String[] args) {
        Student nemanja = new Student();
        nemanja.setSurname("Ženino");

    }
}
