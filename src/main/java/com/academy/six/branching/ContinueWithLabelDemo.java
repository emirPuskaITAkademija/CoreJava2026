package com.academy.six.branching;

/**
 *
 * Postoji varijabla String koja sadrži rečenicu.
 * <p>
 * String recenica = "Look for a substring in me";
 * <p>
 * Postoji i varijabla String koja sadrži rijec.
 * <p>
 * String rijec = "sub";
 *
 * <p>
 * Zadatak: Kreirati program koji
 * će provjeriti da li je riječ sadržana u rečenici.
 * </p>
 *
 */
public class ContinueWithLabelDemo {
    static void main(String[] args) {
        String recenica = "Look for a substring in me";
        String rijec = "sub";
        // Konverzija u nizove
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        for (int i = 0; i < recenicaNiz.length; i++) {
            for (int j = 0; j < rijecNiz.length; j++) {
                char slovoRecenice = recenicaNiz[i+j]; // i = 9, 10, 11
                char slovoRijeci = rijecNiz[j]; // j = 0, 1, 2

            }
        }


    }
}
