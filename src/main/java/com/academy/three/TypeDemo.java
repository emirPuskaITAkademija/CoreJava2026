package com.academy.three;

/**
 *
 * <p>
 * Postoje dvije grupe tipova podataka:
 *  <ol>
 *   <li>prosti / primitive</li>
 *   <li>složeni / object </li>
 *   </ol>
 * </p>
 * <p>
 * <p>
 * <p>
 * Današnje predavanje je posvećeno prostip tipovima podataka.
 * <p>
 *
 *     <ol>
 *    CIJELI BROJEVI
 *  <li>byte = 8 bita .. mali cijeli brojevi</li>
 *  <li>short = 16 bita ... cijeli brojevi </li>
 *  <li>int = 32 bita ... cijeli brojevi </li>  // PODRAZUMIJEVANI default  23
 *  <li>long = 64 bit.... cijeli brojevi </li>
 *  </ol>
 *   <ol>
 *       DECIMALNI BROJEVI:
 *       <li>float 32</li>
 *       <li>double 64</li> // PODRAZUMIJEVANI
 *   </ol>
 *   <ol>
 *       <li> char </li>
 *       <li> boolean </li>
 *   </ol>
 *
 */
public class TypeDemo {
    static void main(String[] args) {
        // Sve počinje od jednog izraza ?
        // TIP ime_varijable = vrijednost;  => izraz formiran od tri različite stvari
        byte firstNumber = 23; // DECIMALNI
        System.out.println(firstNumber);
        byte octalFirstNumber = 027; // OKtalni brojni sistem definira ovako broj 23
        System.out.println("Octal = " + octalFirstNumber);
        byte hexFirstNumber = 0x17; // Heksadeicmalni brojni sistem ovako definira 23
        System.out.println("Hex 23 = " + hexFirstNumber);
        byte binaryFirstNumber = 0b10111; // Binarni zapis broja 23
        System.out.println("Binary = " + binaryFirstNumber);


        // 16-bitni zapis u memoriji i max broj koji može podržati je 32767 ili negativni broj 32768
        short firstShortNumber = 32767;
        System.out.println("First short number = " + firstShortNumber);

        //32-bitni zapis u memoriji
        int firstIntNumber = 2147483647;
        System.out.println("First int number = " + firstIntNumber);

        // 64-bitni zapis u memoriji
        long firstLongNumber = 21474836478L;
        System.out.println("First long number = " + firstLongNumber);

        //64 bitni
        double decimalNumber = 23.45;//decimalni podatak
        //32 bitni
        float floatDecimalNumber = 23.45F; // vrijednost se defaultno tretira kao 64 bitni zapis ..kada dodamo malo f ili F onda se tretira kao 32

        char slovo = 'f';// podatak u kojem se definira char value

        boolean condition = false; // true / false ->

    }
}
