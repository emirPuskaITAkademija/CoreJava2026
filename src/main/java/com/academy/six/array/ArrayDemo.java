package com.academy.six.array;

public class ArrayDemo {
    static void main(String[] args) {
        //TIP varijabla = vrijednost;
        int number = 23;
        System.out.println(number);
        number = 10;
        System.out.println(number);

        // niz prostih formira složene objekte
        // TIP varijable = vrijednosti;
        int[] arrayOfNumbers = new int[2];// 2 puta po 32-bitni slota u memoriji
        arrayOfNumbers[0] = 23;
        arrayOfNumbers[1] = 10;
        System.out.println(arrayOfNumbers[0] + "  " + arrayOfNumbers[1]);

        //Drugi način
        int[] arrayNumbers = { 23, 10 };

    }
}
