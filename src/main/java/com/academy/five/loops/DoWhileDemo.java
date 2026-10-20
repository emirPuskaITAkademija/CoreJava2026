package com.academy.five.loops;

import java.util.Scanner;

/**
 * do{
 *
 * }while(number != 5);
 */
public class DoWhileDemo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Unesi broj");
            number = scanner.nextInt();
            if(number != 5){
                System.out.println("Pokušaj ponovo");
            }
        }while(number != 5);

        System.out.println("Unio si peticu i počeo si igricu !");
        scanner.close();
    }
}
