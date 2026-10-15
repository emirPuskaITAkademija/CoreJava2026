package com.academy.four.operator.quiz;

// TIP varijabla = vrijednost;
public class Quiz5 {
    static void main(String[] args) {
        int a = 23;
        int b = 10;
        boolean ok = a == 23 || ++b>10;
        //A 11 true
        //B 11 false
        //C 10 true
        //D 10 false
        System.out.println(b + " " + ok); // C
    }
}
