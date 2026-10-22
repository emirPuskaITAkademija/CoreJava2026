package com.academy.six.branching;

import java.util.Scanner;

/**
 * Puštamo korisnika da unese broj:
 * <p>
 * Ukoliko se dokaže i pokaže da broj postoji u dvo-dimenzionalnom nizu onda
 * moramo iskočiti iz petlje i ispisati na kojoj poziciji u dvo-dimenzionalnom nizu se nalazi taj broj.
 */
public class BreakWithLabelDemo {
    static void main(String[] args) {
        int[][] arrayOfNumbers = {
                {32, 87, 3, 589, 12, 1076, 200, 8},
                {3455, 187, 13, 1589, 112, 11076},
                {321, 871, 31, 5891, 121, 10761, 81},
        };
        System.out.println("Unesi broj:");
        int enteredNumber = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        int i = 0;
        int j = 0;
        LABELA:
        for (i = 0; i < arrayOfNumbers.length; i++) {
            int[] numbers = arrayOfNumbers[i];
            for (j = 0; j < numbers.length; j++) {
                int number = numbers[j];
                if (enteredNumber == number) {
                    foundIt = true;
                    break LABELA;
                }
            }
        }
        if (foundIt) {
            System.out.println("Uneseni broj se nalazi na pozicji [" + i + ", " + j + "]");
        } else {
            System.out.println("Nema tog broja");
        }
    }
}
