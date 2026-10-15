package com.academy.four.operator.quiz;

// TIP varijabla = vrijednost;
public class Quiz4 {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result = a > 10 && ++b > 20;
        //A 20 false
        //B 21 true
        //C 21 false
        //D 20 true
        System.out.println(b + " " + result); // A
    }
}
