package com.academy.seven.oop;

/**
 * Klasu koristimo da definiramo VLASTITI TIP podatka.
 * <p>
 *     Kako to da uradimo odnosno šta klasa može imati na raspolaganju kako bi nam to omogućila ?
 *
 *     Klasa može/mora imati:
 *      <li>1. može imati su fields/properties/polja koja su imenovana</li>
 *      <li>2. mora imati je konstruktor</li>
 *      <li>3. može imati su funkcije/metode</li>
 * </p>
 *
 * Modifikatori vidljivosti u Javi:
 * <li>1. public</li>
 * <li>2. protected</li>
 * <li>3. package private - bez ključne riječi</li>
 * <li>4. private</li>
 */
class Car {
    String marka;
    String model;
    int godiste;
    int brzina;
    int trenutnaBrzina;

    //KONSTRUKTOR
    public Car(){

    }

    public Car(String m, String md, int godiste, int brzina){
        marka = m;
        model = md;
        this.godiste = godiste;
        this.brzina = brzina;
    }

    public void postaviTrenutnuBrzinu(int param){
        this.trenutnaBrzina = param;
    }

    public void ubrzaj(){
        if(this.trenutnaBrzina<brzina){
            this.trenutnaBrzina++;
        }
    }

}
