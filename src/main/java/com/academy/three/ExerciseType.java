package com.academy.three;

public class ExerciseType {
    static void main(String[] args) {
        char firstLetter = 'A';
        char secondLetter = 'B';

        int firstNumber = firstLetter;
        int secondNumber = secondLetter;

        System.out.println(firstNumber);//65
        System.out.println(secondNumber);//66

        char nextLetter = (char)(firstLetter+1);//B
        System.out.println(nextLetter);

        int result = 'A' + 'B';
        System.out.println("Result = " + result);
        System.out.println('A' + 'B'); // 131
        System.out.println('A' +  1); // B -> 66
        System.out.println("A" + "B");// AB

        String text = "Zeljko";
    }
}
