package com.twu28.biblioteca.model;

public class Movie {

    private final String name;
    private final int yearOfRelease;
    private final String directorName;
    private final double rating;

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
