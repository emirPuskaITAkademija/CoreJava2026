package com.academy.seven.oop;

public class CarDemo {
    static void main(String[] args) {
        String marka = "Volkswagen";
        String model = "Tiguan";
        int godište = 2022;
        int brzina = 0;

        //Niz ima polja koja su indeksirana
        //Svako polje niza ima vrijednost ISTOG TIPA
        int[] numbers = new int[10];
        numbers[0] = 111;
        numbers[1] = 2233;
        numbers[2] = 311;

        int[] numbers2 = {23, 34, 45};
        //Klasa ima polja koja su imenovana
        //Kalsa može imati polja koja su RAZLIČITOG TIPA
        Car car1 = new Car();
        car1.marka = "VW";
        car1.model = "Tiguan";
        car1.brzina = 7;

        Car car2 = new Car();
        car2.marka = "BMW";
        car2.model = "X5";

        Car car3 = new Car("Mercedes", "GLC", 2021, 7);
        System.out.println(car3.marka);
        car3.postaviTrenutnuBrzinu(1);
        System.out.println(car3.trenutnaBrzina);
        car3.ubrzaj();
        car3.ubrzaj();
        car3.ubrzaj();
        car3.ubrzaj();
        System.out.println(car3.trenutnaBrzina);
    }
}
