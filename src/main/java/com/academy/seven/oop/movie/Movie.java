package com.academy.seven.oop.movie;

public class Movie {
    private String title;
    private String director;
    private int year;
    private int rating;//1-10

    public Movie(){

    }

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(int rating) {
        if(rating<1){
            this.rating = 1;
        }else if(rating>10){
            this.rating = 10;
        }else{
            this.rating = rating;
        }
    }

    public int getRating() {
        return rating;
    }
}
