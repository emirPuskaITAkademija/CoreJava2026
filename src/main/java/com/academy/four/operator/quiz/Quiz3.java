package com.academy.four.operator.quiz;

// TIP varijabla = vrijednost;
public class Quiz3 {
    static void main(String[] args) {
        int a = 4;
        int b = ++a + a++;//1. 5 + a++ 2. 5+5 3. 10
        //A 5 9
        //B 6 10
        //C 6 11
        //D 5 10
        System.out.println(a + " " + b); // 6 10
    }
}
