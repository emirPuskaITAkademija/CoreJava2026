package com.academy.three;

// TIP  imeVarijable = vrijednost;
// DEFAULT cijelobrojni tip
public class Quiz2 {
    static void main(String[] args) {
        short a = 10;
        short b = 20;
//        short c = a + b; // Ovo neće da se kompajlira jer javac se pokušava ppozvat od strane IDE(IntelliJ)

        short rezultat = (short) (a + b); // 1. vrijednost se tretira kao default int 32 bita 2. 32 bitn value pokušava ubaciti u 16 bit

    }
}
