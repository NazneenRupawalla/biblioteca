package com.twu28.biblioteca;

public class Movie {

    private String name;
    private int yearOfRelease;
    private String directorName;
    private double rating;

    public Movie(String name, int yearOfRelease, String directorName, double rating) {
        this.name=name;
        this.yearOfRelease=yearOfRelease;
        this.directorName=directorName;
        this.rating=rating;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public String getDirectorsName() {
        return directorName;
    }

    public double getRating() {
        return rating;
    }
}
