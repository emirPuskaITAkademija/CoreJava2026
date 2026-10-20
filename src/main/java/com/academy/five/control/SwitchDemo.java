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
 * Pravimo program koji treba da dijete koje je naučilo da sedmica ima 7 dana nauči to dijete i kako se taj dan
 * kaže na njemačkom jeziku.
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
public class SwitchDemo {
    static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmice počevši od 1 do 7 da saznaš kako se taj dan kaže na Njemačkom");
        int redniBrojDanaUSedmici = new Scanner(System.in).nextInt();
        String imeDanaNaNjemackom;
        switch (redniBrojDanaUSedmici) {
            case 1:
                imeDanaNaNjemackom = "Montag";
                break;
            case 2:
                imeDanaNaNjemackom = "Dienstag";
                break;
            case 3:
                imeDanaNaNjemackom = "Mittwoch";
                break;
            case 4:
                imeDanaNaNjemackom = "Donnerstag";
                break;
            case 5:
                imeDanaNaNjemackom = "Freitag";
                break;
            case 6:
                imeDanaNaNjemackom = "Samstag";
                break;
            case 7:
                imeDanaNaNjemackom = "Sonntag";
                break;
            default:
                imeDanaNaNjemackom = "Ungewohnlich";
                break;
        }
        System.out.println("Ime dana na njemačkom: " +  imeDanaNaNjemackom);
    }
}
