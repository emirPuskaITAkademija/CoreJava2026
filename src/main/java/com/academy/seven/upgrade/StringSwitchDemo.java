package com.academy.seven.upgrade;

import java.util.Scanner;

/***
 * <li>1. switch-case with break</li>
 * <li>2. switch case without break</li>
 * <li>3. switch sa spojenim caseovima</li>
 *
 *
 *   INPUT ili ulaz u SWITCH konstrukciju šta ?
 *
 *   int ili nešto što je konvertibilno u int
 *
 *   <p>
 *       JDK 1.7 u switch može ići i String
 *   </p>
 *   Zadatak:
 *   <p>
 *       Program zahtjeva od vas da unesete ime vašeg omiljenog programskog jezika.
 *       U zavisnosti od toga koje ime jezika ste odabrali program će izbaciti neke informacije o tom programskom jeziku
 *   </p>
 */
public class StringSwitchDemo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koji programski jezik želiš učiti ? ");
        String language = scanner.nextLine();
        String lowercaseLanguage = language.toLowerCase();
        switch (lowercaseLanguage) {
            case "java":
                System.out.println("Java je objektno orijentisani jezik. Koristi se za enterprise app dev");
                break;
            case "python":
                System.out.println("Python je popularan za data science. Vole ga i ljudi koji nisu developeri");
                break;
            case "javascript":
                System.out.println("JavaScript se koristi za web app development");
                break;
            case "c#":
                System.out.println("C# se koristi u .net ekosistemu");
                break;
            default:
                System.out.println("Nepoznat programski jezik");
        }
        scanner.close();
    }
}
