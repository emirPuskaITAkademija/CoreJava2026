package com.academy.four.operator;

import java.util.Scanner;

public class SideEffectDemo {
    static void main(String[] args) {
        int broj1 = new Scanner(System.in).nextInt();
        int broj2 = 20;
        if (broj1 == 23 && ++broj2 == 21) {
            System.out.println("Oba uslova zadovoljena");
        }
        //ISPIS u konzoli
        // 20 - zašto ? TAČAN
        // 21 - zašto ?
        System.out.println("broj2 = " + broj2);
    }
}
