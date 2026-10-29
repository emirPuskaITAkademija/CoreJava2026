package com.academy.eight.sample;

public class BookDemo {
    static void main(String[] args) {
        System.out.println("Counter = " + Book.counter); // 0
        Book.printSomething("Neki tekst vezan za static...");


        Book book1 = new Book();
        book1.setTitle("Concept of OOP");
        book1.setAuthor("Nemanja");
        System.out.println("Book1 = " + Book.counter); // 1


        Book book2 = new Book();
        book2.setTitle("Deep Learning");
        book2.setAuthor("Dušan");
        System.out.println("Book2 = " + book2.counter); // 1,2

        Book book3 = new Book();
        book3.setTitle("Neuronske mreže");
        book3.setAuthor("Danijel");
        System.out.println("Book3 = " + book3.counter); // 3
        System.out.println("Book1 = " + book1.counter); // 1 -> 3
        System.out.println("Book2 = " + book2.counter);// 3
        System.out.println("Book3 = " + book3.counter);// 3
    }
}
