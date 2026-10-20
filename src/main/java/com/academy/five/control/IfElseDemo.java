package com.academy.five.control;

import java.util.Scanner;

/**
 * Hoću da napravim program koji će dopustiti profesoru da
 * definira ocjenu na osnovu broja poena koje je student ostvario na ispitu.
 * <p>
 * int score = profesor će pregledati unijeti u naš program.
 * <p>
 * Šta će program riješiti ?
 * Program će automatski uzeti score i definirati ocjenu za studenta.
 * char grade;
 * 'A' 90
 * 'B' 80
 * 'C' 70
 * 'D' 60
 * 'F' ..
 * </p>
 */
public class IfElseDemo {
    static void main(String[] args) {
        System.out.println("Unesite broj poena pregledanog ispita:");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojPoena > 90) {
            ocjena = 'A';
        } else if (brojPoena > 80) {
            ocjena = 'B';
        } else if (brojPoena > 70) {
            ocjena = 'C';
        } else if (brojPoena > 60) {
            ocjena = 'D';
        } else {
            ocjena = 'F';
        }
        System.out.println("Ocjena = " + ocjena);
    }
}
