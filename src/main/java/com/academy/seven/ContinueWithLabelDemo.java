package com.academy.seven;

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
        boolean contains = false;
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        MARKER: for (int i = 0; i < recenicaNiz.length; i++) {
            //int i = 11 j = 0;
            for (int j = 0; j < rijecNiz.length; j++) {
                char slovoRecenice = recenicaNiz[i+j];
                char slovoRijeci = rijecNiz[j];
                if(slovoRecenice != slovoRijeci) {
                    continue MARKER; // skip samo j korak
                }
            }
            contains = true;
            break;
        }
        System.out.println(contains? "Riječe JESTE sadržana u rečenici":"Riječ NIJE sadržana u rečenici");
    }
}
