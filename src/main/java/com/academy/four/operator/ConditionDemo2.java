package com.academy.four.operator;

import java.util.Scanner;

// ?
public class ConditionDemo2 {
    static void main(String[] args) {
        System.out.println("Unesi prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        int number2 = new Scanner(System.in).nextInt();
        boolean equal = number1==number2;
//        String resultText;
//        if(equal){
//            resultText = "Jednaki brojevi";
//        }else{
//            resultText = "Nejednaki brojevi";
//        }
        String resultText = equal ? "Jednaki": "Nejednaki";
        System.out.println(resultText);
    }
}
