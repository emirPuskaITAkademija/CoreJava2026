package com.academy.six.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dopustite korisniku da definira veličinu vašeg niza brojeva.
 * Zatim dopustite korisniku da definira i vrijednost u tom nizu.
 */
public class ArrayDemoZadatak {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Definiraj veličinu niza:");
        int size = scanner.nextInt();
        int[] arrayOfNumbers = new int[size];
        System.out.println("Sada popuni vrijednosti tog niza:");
        for (int i = 0; i < size; i++) {
            System.out.println("Definiraj vrijednost na indexu " + i);
            arrayOfNumbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
