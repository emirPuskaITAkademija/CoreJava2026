package com.academy.five.control;

import java.util.Scanner;

/**
 * Zadatak:
 * <p>
 * Pravimo program koji dopušta korisniku da unese
 * redni broj mjeseca u godini i godinu.
 * <p>
 * month, year -> korisnik će unijeti njihove vrijednosti
 *
 * <p>
 * Program treba da izbaci koliko mjesec ima dana ?
 * <p>
 * Mogući rezultati : 31, 30, 28, 29
 * <p>
 * Papa Grgur 13 = definisao je koncept prestupne godine..
 * </p>
 * </p>
 */
public class SwitchDemo3 {
    static void main(String[] args) {
        System.out.println("Unesi mjesec:");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Unesi godinu:");
        int year = new Scanner(System.in).nextInt();

        int numberOfDays = 0;
        //case - ima vlastiti blok koda koji se izvršava kada je month = broju case
        //šta ako više case-ova dijeli isti blok koda
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            //Sve prestupne godine djeljive su sa četiri ako nisu djeljive sa 100, kojima se dodaju one djeljive sa 400.
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println("Number of days = " + numberOfDays);
    }
}
