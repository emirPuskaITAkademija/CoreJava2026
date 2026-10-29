package com.academy.seven.oop.movie;

public class MovieDemo {
    static void main(String[] args) {
        //lack of encapsulation

        Movie movie1 = new Movie();
        movie1.setDirector("Stiven Spielberg");
        movie1.setYear(1994);
        movie1.setTitle("Jurassic Park");
        movie1.setRating(0);

        Movie movie2 = new Movie();
        movie2.setDirector("Quantin Tarantino");
        movie2.setYear(2014);
        movie2.setTitle("Django");
        movie2.setRating(200);

        System.out.println(movie1.getRating());

    }
}
