package com.academy.eight.sample;

public class Book {

    public static int counter = 0;

    private String title;
    private String author;

    public Book() {
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void printSomething(String text){
        System.out.println(text);
    }
}
