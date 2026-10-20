package com.academy.five.control;

import java.util.Scanner;

public class BlockDemo {
    static void main(String[] args) {
        System.out.println("Pritisni peticu i započni igricu..");
        int number = new Scanner(System.in).nextInt();

        if (number == 5) {
            System.out.println("Počeo si igricu..");
        }

        System.out.println("Kraj programa..");
    }
}
