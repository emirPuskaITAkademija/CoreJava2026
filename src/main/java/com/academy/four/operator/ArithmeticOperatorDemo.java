package com.academy.four.operator;


import java.util.Scanner;

/**
 * Aritmetički operatori:
 * <li>1. +  Additive (zbrajanja/sumiranja ili spajanja)</li>
 * <li>2. - Subtraction (oduzimanja)</li>
 * <li>3. * Multiplication(množenje)</li>
 * <li>4. / Division operator(dijeljenje)</li>
 * <li>5. %  Remainder operator(ostatak od dijeljenja)</li>
 */

// y = f(x1, x2)
    // result = f(number1, number2)
public class ArithmeticOperatorDemo {
    static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj:");
        int number2 = new Scanner(System.in).nextInt();

        // +
        int result = number1 + number2;
        System.out.println("Suma = " + result); //33
        // -
        result = number1 - number2;
        System.out.println("Razlika = " + result); // 13
        // *
        result = number1 *  number2;
        System.out.println("Umnožak/Proizvod = " + result); // 230
        // /
        result = number1 / number2;
        System.out.println("Količnik = " + result); // 2
        // %
        result = number1 % number2;
        System.out.println("Ostatak od dijeljenja = " + result); // 3
    }
}
