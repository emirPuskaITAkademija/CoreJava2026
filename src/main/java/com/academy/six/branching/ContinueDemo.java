package com.academy.six.branching;

/**
 * Izbrojati koliko se slovo p  puta ponavlja u nekom tekstu
 */
public class ContinueDemo {
    static void main(String[] args) {
       String text = "Petar Pan je pojeo pet plavih šljiva";
       char[] textArray = text.toCharArray();
       int numbersOfP = 0;
       for(int i = 0; i < textArray.length; i++){
           char slovo = textArray[i];
           if(slovo != 'p' && slovo != 'P'){
               continue;
           }
           numbersOfP++;
       }
        System.out.println("Ukupno =  " + numbersOfP);
    }
}
