package com.academy.six.branching;

import java.util.Scanner;

/**
 * Korisnik treba da unese broj.
 * <p>
 * Zadatak:
 * Program treba da kaže korisniku da li broj postoji ili ne.
 * Dvije su mogućnosti:
 * <li>1. Uneseni broj postoji u našem nizu i nalazi se na indexu = ___</li>
 * <li>2. Uneseni broj ne postoji u našem nizu</li>
 */
public class BreakDemo {
    static void main(String[] args) {
        int[] arrayOfNumbers = {
                32, 87, 3, 589, 12, 1076, 200, 8
        };
        System.out.println("Unesi neki broj i okušaj sreću:");
        int enteredNumber = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        int i;
        for (i = 0; i < arrayOfNumbers.length; i++) {
            int numberInArray = arrayOfNumbers[i];
            if (enteredNumber == numberInArray) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            System.out.println("Uneseni broj postoji u našem nizu i nalazi se na indexu = " + i);
        } else {
            System.out.println("Uneseni broj ne postoji u našem nizu");
        }
    }
}
