package com.academy.six.array;

public class ArrayCopyOfDemo {
    static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(new String(copyTo));
    }
}
