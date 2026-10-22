package com.academy.six.array;

import java.util.Random;
import java.util.Scanner;

/**
 *  Generisati brojeve od strane programa pomoću nekog algoritma.
 *
 *   Random random = new Random();
 *   random.nextInt(100);
 * <p>
 * Zadatak: Dopustite korisniku da ima 3 pokušaja da pogodi koji broj je sadržan u nizu zvanom numbers.
 * Ukoliko korisnik pogodi iz
 * <li>1.  prvog puta - ZLATNA MEDALJA</li>
 * <li>2.  drugog puta - SREBRENA MEDALJA</li>
 * <li>2.  trećeg puta - BRONZANA MEDALJA</li>
 */
public class ArrayDemo3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        // Omogućiti koriniku unos i brojati pokušaje
        int pokusaji = 0;
        while (pokusaji < 3) {
            System.out.println("Unesi broj i okušaj sreću:");
            int uneseniBroj = scanner.nextInt();
            boolean pogodak = false;
            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                if (uneseniBroj == number) {
                    pogodak = true;
                    break;
                }
            }
            if(pogodak){
                break;
            }
            pokusaji++;
        }

        if(pokusaji == 0){
            System.out.println("ZLATO");
        }else if(pokusaji == 1){
            System.out.println("SREBRO");
        } else if (pokusaji == 2) {
            System.out.println("BRONZA");
        }else{
            System.out.println("BEZ MEDALJE");
        }

    }
}
