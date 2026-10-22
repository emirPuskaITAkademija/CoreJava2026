package com.academy.six.array;

public class MultiDimensionalArrayDemo {
    static void main(String[] args) {
        String[][] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones"}
        };
        //Mr. Smith -> names
        System.out.println(names[0][0] + " " + names[1][0]);
        //Ms. Jones
        System.out.println(names[0][2] + " " + names[1][1]);
    }
}
