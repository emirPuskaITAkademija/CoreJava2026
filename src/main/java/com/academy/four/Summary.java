package com.academy.four;


// TIP varijabla = vrijednost;
public class Summary {
    static void main(String[] args) {
        byte number1 = 23;
        byte number2 = 124;
        //Java Binary Numeric Promotion(automatska promocija numeričkih tipova)
        // Zašto Java prijavljuje grešku ?  JAVAC compile error  javac
        byte suma = (byte) (number1 + number2);//32-bit int

        //byte + byte = int
        //short + short = int
        //byte + short = int
        //char + char = int
        //int + long = long
        //float + long = float
        // float +  double =

        int n1 = 234;// 32-bitni zapis
        long n2 = 1234; // 64-bitni zapis

        int suma2 = (int) (n1 + n2); // TIP varijabla = vrijednost;   1. vrijednost evaluira kao 64-bitni zapis 2. operator dodjele vrijednosti


        //TIP varijabla = vrijednost;
        //1. step : vrijednost je float 32-bitni
        //2. step: operator dodjele vrijednost ubacuje varijablu tipa float 32-bitni
        float floatingNumber1 = 23.34F;

    }
}
