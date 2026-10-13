package com.academy.three;


// TIP varijabla = vrijednsot;
public class Question {
    static void main() {
        double rezultat = (double) 7/2;
        //Step 1: (double) 7 - int -> double 7.0
        //Step 2: 7.0/2
        //Step 3: jedan operand  je tipa double, Java automatski konvertuje i 2 u 2.0
        //Step 4: izvršava se dijeljenje : 7.0/2.0 = 3.5
        //Step 5: 3.5 se dodjeljuje varijabli rezultat
        System.out.println(rezultat);
    }
}
