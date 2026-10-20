package com.academy.five.operator;

import java.util.Scanner;

/**
 *
 * Bitwise & Bitshift..
 *
 * U Javi postoje operatori koji rade direktno nad bitovima (0 i 1).
 * <p>
 *     Računar skladišti cijele brojeve pomoću bitova.
 * </p>
 *
 *
 */
public class OperatorDemo {
    static void main(String[] args) {
        //32-bitni zapis u memoriji
        //0x1101
        // 8 + 4 + 1
        // 2 na 3 = 8
        // 2 na 2 = 4
        // 2 na 0  = 1
        int number = 13;
        System.out.println(Integer.toBinaryString(number));

        int binaryNumber = 0b1101;
        System.out.println(binaryNumber);

        //Operator <<  - pomjeral ulijevo (LEFT SHIFT)
        //0000...01101
        //0000...11010
        System.out.println(number<<3);


        // Operator >> - pomjeraj udesno (RIGHT SHIFT)
        System.out.println("Unesi parni broj: ");
        int korisnickiBroj = new Scanner(System.in).nextInt();
        System.out.println("Unesi stepen dijeljenja: ");
        int stepenDijeljenja = new Scanner(System.in).nextInt();
        int rezultat = korisnickiBroj>>stepenDijeljenja;
        System.out.println("Rezultat = " + rezultat);
    }
}
