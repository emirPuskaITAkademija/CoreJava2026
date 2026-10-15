package com.academy.four.operator;

import java.util.Scanner;

public class SideEffectDemo2 {
    static void main(String[] args) {
        int broj1 = new Scanner(System.in).nextInt();
        int broj2 = 20;
        if (broj1 == 23 || ++broj2 == 21) {
            System.out.println("Uslov zadovoljen");
        }
        System.out.println("broj2 = " + broj2);//21
    }
}
