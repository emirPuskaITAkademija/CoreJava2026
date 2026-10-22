package com.academy.five.homework;

import java.util.Scanner;

/**
 * Korisnik unosi broj 5 da započne igricu.
 * Ukoliko ne uspije 3x unijeti 5 ispisujemo da je "Igrica je zaključana".
 * <p>
 * Ideja: Korisnik pokušava maksimalno 3 puta unijeti broj 5 i ukoliko ne uspije moramo
 * zaključati igricu.
 * <p>
 * HINT: možete koristiti kombinaciju while, if-else, logički operator && i brojač pokušaja trebate imati
 */
public class Zadatak1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;
        int pokusaji = 0;
        while(broj!=5 && pokusaji<3) {
            System.out.println("Unesi peticu i započni igricu:");
            broj = scanner.nextInt();
            pokusaji++;
        }
        if(broj==5){
            System.out.println("Započeo si igricu, jer si pritisnuo peticu");
        }else{
            System.out.println("Igrica je zaključana");
        }
        scanner.close();
    }
}
