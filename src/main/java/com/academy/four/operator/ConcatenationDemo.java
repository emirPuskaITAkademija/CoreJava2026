package com.academy.four.operator;

/**
 * +
 * 1. zbrajanje
 * 2. spajanje(concatenation)
 */
public class ConcatenationDemo {
    static void main(String[] args) {
        char slovo = 'A';//65  ASCII
        int number = 23;

        //char(16-bit) + int(32 bit) = int
        // 1. step : slovo(int po ASCII) + number(int)
        // 2. step: 65 + 23
        // 3. step: dodjela sume 88 u rezultat
        int rezultat = slovo + number;
        System.out.println("Rezultat = " + rezultat);

        String text = "Luka i Nemanja su dva česta u našem predavanju";
        String text2 = "Java je vrlo mocan programski jezik, ali Bgm nije lako";
        String rezultatZbrajanjaTeksta = text + text2;
        System.out.println(rezultatZbrajanjaTeksta);

    }
}
