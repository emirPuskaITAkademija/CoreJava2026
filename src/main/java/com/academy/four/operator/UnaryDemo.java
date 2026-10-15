package com.academy.four.operator;

import java.util.Scanner;

/**
 *  UNO OPERAND
 *
 * Unarni operatori:
 * <li>1. +  indicira pozitivnu numberičku vrijednost </li>
 * <li>2. - minus opeerator; pretvara numeričku vrijednost u negativan broj</li>
 * <li>3. ++ INCREMENT
 *      <li>3.1 POST INCREMENT</li>
 *      <li>3.2 PRE INCREMENT</li>
 * </li>
 * <li>4. --  Decrement
 *     <li>4.1</li>
 *     <li>4.2</li>
 * </li>
 *
 * <li> 5.   !   invertor boolean - logicL COMPLMENT OPERATOR</li>
 */
public class UnaryDemo {
    static void main(String[] args) {
        System.out.println("Unesi broj: ");
        int broj = new Scanner(System.in).nextInt();


        int result = +broj;
        System.out.println("Pozitivan broj = " + result);
        result = -broj;
        System.out.println("Negativan broj = " + result);

        //POST INCREMENT
        result = 23;
        System.out.println(result++);//24  -> 23
        System.out.println(result); // 24
        //PRE INCREMENT
        result = 23;
        System.out.println(++result);//24 -> 24

        // POST DECREMENT
        result = 23;
        System.out.println(result--);// 23
        System.out.println(result); // 22
        //PRE DECREMENT
        result = 23;
        System.out.println(--result); //22

        boolean lav = false;
        System.out.println(!lav);
    }
}
