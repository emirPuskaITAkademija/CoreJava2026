package com.academy.five.control.quiz;

import java.util.Scanner;

/**
 * Program treba pustiti korisnika da unese broj.
 * Kad korisnik unese broj treba da provjeri da li je broj paran ili neparan i da
 * tu informaciju saopšti korisniku.
 */
public class Quiz1 {
    static void main(String[] args) {
        System.out.println("Unesi neki broj:");
        int broj = new Scanner(System.in).nextInt();
        boolean paran = broj % 2 == 0;
        if(paran){
            System.out.println("Unio si paran broj");
        }else {
            System.out.println("Unio si neparan broj");
        }
    }
}
