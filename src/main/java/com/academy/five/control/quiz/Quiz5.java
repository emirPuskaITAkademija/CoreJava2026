package com.academy.five.control.quiz;

//A   ABC
//B  BCD
//C  B
//D   BC
public class Quiz5 {
    static void main() {
        int dan = 2;
        switch (dan) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
            case 3:
                System.out.print("C");
                break;
            default:
                System.out.print("D");
        }
    }
}
