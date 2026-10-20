package com.academy.five.control;

import java.util.Scanner;

/**
 * Učimo Njemački i trebamo unijeti naziv dana u sedmici.
 * Program će provjeriti naš unos(koji neće biti osjetljiv na mala i velika slova)
 * i ako smo ispravno unijeli naziv dana u sedmici na njemačkom ispisaće redni broj tog dana.
 */
public class StringSwitchDemo {

    static void main(String[] args) {
        System.out.println("Unesi naziv dana na Njemačkom");
        String dayName = new Scanner(System.in).nextLine();
        dayName = dayName.toLowerCase();
        // "montag"
        //Java 7 - uvodi switch construct koji prima ne samo int nego i String
        int dayNumber = 0;
        // INPUT -> int, String
        switch (dayName) {
            case "montag":
                dayNumber = 1;
                break;
            case "dienstag":
                dayNumber = 2;
                break;
            case "mittwoch":
                dayNumber = 3;
                break;
            case "donnerstag":
                dayNumber = 4;
                break;
            case "freitag":
                dayNumber = 5;
                break;
            case "samstag":
                dayNumber = 6;
                break;
            case "sonntag":
                dayNumber = 7;
                break;
            default:
                System.out.println("Invalid day name");
                break;
        }

        System.out.println("Day number: " + dayNumber);
    }
}
