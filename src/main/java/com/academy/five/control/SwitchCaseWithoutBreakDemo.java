package com.academy.five.control;

import java.util.Scanner;

/**
 *
 * Ključne riječi:
 * <p>
 * switch
 * case
 * break
 * </p>
 * <p>
 * Pravimo program koji treba da nam dopusti da unesemo zadnji broj dana koji smo naučili na Njemačkom.
 * Dakle ako je to Mittwoch mi ćemo unijeti 3 a program će nam morati ispisati preostale dane na Njemačkom
 * uključujući i taj dan koji predstavlja izvjenu među.
 *
 * <p>
 * Montag
 * Dienstag
 * Mitwoch
 * Donnerstag
 * Freitag
 * Samstag
 * Sonntag
 *
 */
public class SwitchCaseWithoutBreakDemo {
    static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmice počevši od 1 do 7 da saznaš kako se taj dan kaže na Njemačkom");
        int redniBrojDanaUSedmici = new Scanner(System.in).nextInt();
        String germanNames = "";
        switch (redniBrojDanaUSedmici) {
            case 1:
                germanNames = germanNames + "Montag ";
            case 2:
                germanNames = germanNames + "Dienstag ";
            case 3:
                germanNames = germanNames + "Mittwoch ";
            case 4:
                germanNames += "Donnerstag ";
            case 5:
                germanNames += "Freitag ";
            case 6:
                germanNames += "Samstag ";
            case 7:
                germanNames += "Sonntag ";
                break;
            default:
                germanNames += "Ungewohnlich ";
                break;
        }
        System.out.println("Ime dana na njemačkom: " +  germanNames);
    }
}
