package com.academy.three;

public class ExtendedTypeDemo {
    static void main(String[] args) {
        // byte 8 bitni, short 16 bit , int 32 bit , long 64 bit

        byte byteNumber = 23;
        //widening casting - konverzija proširivanjem jer idemo u širi stan
        short shortNumber = byteNumber; // automatska konverzija tipa - konverzija iz užeg u širi tip
        System.out.println("Short number vrijednost = " + shortNumber);

        int number = 32;
        //Narrowing Casting - konverzija skraćivanje - eksplicitno moramo preuzeti odgovornost
        short secondShortNumber =(short) number;  // 32 bit  16 bit

        char slovo = 's'; // Svako slovo ima svoj ekvivalent u brojevnom smislu  's' 115
        int nekiBroj = slovo;
        System.out.println("Neki broj vrijednost = " + nekiBroj); // Koja vrijednost je dodijeljena varijabli nekiBroj

        int slovnaVrijednostBrojevno = 65;

        char slovoA = (char) slovnaVrijednostBrojevno;
        System.out.println("Vrijednost = "+slovoA);
    }
}
