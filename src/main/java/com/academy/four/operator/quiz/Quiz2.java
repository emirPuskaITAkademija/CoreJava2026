package com.academy.four.operator.quiz;

public class Quiz2 {
    static void main(String[] args) {
        int a = 5;
        int b = a++;
        //A 5 5
        //B 5 6
        //C 6 6
        //D 6 5
        System.out.println(a + " " + b);//D
    }
}
