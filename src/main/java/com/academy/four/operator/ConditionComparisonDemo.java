package com.academy.four.operator;


import java.util.Scanner;

/**
 * <li> && USLOVNI AND
 * <li> || uslovni OR
 */
public class ConditionComparisonDemo {
    static void main(String[] args) {
        System.out.println("Unesi prvi broj");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        int broj2 = new Scanner(System.in).nextInt();
        //USLOVNI AND
        if(broj1==23 && broj2==24){
            System.out.println("Idemo u šetnju");
        }
        // USLOVNI OR
        if(broj1 == 23 || broj2 >12){
            System.out.println("Jedan od uslova je zadovoljen i moramo trčati");
        }

    }
}
