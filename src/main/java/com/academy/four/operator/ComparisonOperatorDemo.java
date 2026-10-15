package com.academy.four.operator;

import java.util.Scanner;

/**
 * <li> ==
 * <li> !=
 * <li> >
 * <li> <
 * <li> >=
 * <li> <=
 */
public class ComparisonOperatorDemo {
    static void main(String[] args) {
        System.out.println("Unesi cijeli broj: ");
        int value1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj: ");
        int value2 = new Scanner(System.in).nextInt();

        boolean equal = value1 == value2;
        if (equal) {
            System.out.println("Unio si jednake vrijednosti");
        }
        boolean notEqual = value1 != value2;
        if (notEqual) {
            System.out.println("Unio si različite vrijednosti");
        }

        boolean greaterThan = value1 > value2;
        if (greaterThan) {
            System.out.println("value1 > value2");
        }
        if (value1 < value2) {
            System.out.println("value1 < value2");
        }

        if(value1 >= value2){
            System.out.println("value1 >= value2");
        }
        if(value1 <= value2){
            System.out.println("value1 <= value2");
        }
    }
}
