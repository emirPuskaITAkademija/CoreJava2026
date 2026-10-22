package com.academy.six.array;

import java.util.Arrays;

public class ArrayCopyOfDemo2 {
    static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(new String(copyTo));
    }
}
