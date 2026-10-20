package com.academy.five.loops;

import java.util.Scanner;

/**
 * PETLJA: blok koda koji se izvršava sve dok je zadovoljen uslov petlje.
 * <p>
 * while(condition){
 * <p>
 * }
 */
public class WhileDemo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Unesi broj");
        int number = scanner.nextInt();
        while (number != 5) {
            System.out.println("Nisi unio peticu. Pokušaj ponovo");
//            number = scanner.nextInt();
        }

        // A Program traži novi broj
        // B  Program će ostati u beskonačnoj petlji ako početni broj nije 5
        // C Program će automatski postaviti broj na 5
        // D Program će završiti nakon prvog pokušaja
        System.out.println("Unio si peticu i počeo si igricu !");
        scanner.close();
    }
}
