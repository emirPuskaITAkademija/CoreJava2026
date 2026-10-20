package com.academy.five.control;

import java.util.Scanner;

/**
 * Java 21 - moderniji switch
 *
 * <p>
 * ->
 * Program korisniku dopušta da unese redni broj dana.
 * Kao rezultat treba da ispiše poruku koja će korisnika obavijestiti da li je to:
 * "Radni dan"
 * "Vikend"
 * "Nepoznat dan"
 * </p>
 */
public class ModernSwitchDemo {
    static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmici:");
        int redniBrojDana = new Scanner(System.in).nextInt();
        //TIP varijabla = vrijednost;
        String tipDana = switch (redniBrojDana) {
            case 1, 2, 3, 4, 5 -> "Radni dan";
            case 6, 7 -> "Vikend";
            default -> "Nepoznat dan";
        };
//        switch (redniBrojDana) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                tipDana = "Radni dan";
//                break;
//            case 6:
//            case 7:
//                tipDana = "Vikend";
//                break;
//            default:
//                tipDana = "Nepoznat dan";
//                break;
//        }
        System.out.println(tipDana);
    }
}
