package com.academy.six.homework;

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
        int number = 0;
        int brojac = 0;
        do {
            if (brojac == 3) {
                System.out.println("Niste uspeli da unsete peticu pa smo zaključali igricu");
                break;
            }
            System.out.println("Unesite peticu da započnete igricu");
            number = scanner.nextInt();
            brojac++;
        } while (number != 5);
        if (number == 5) {
            System.out.println("Uneli ste peticu i zapoceli igricu");
        }
    }
}
