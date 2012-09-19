package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieListing implements Printable{


    private List<Movie> listOfMovies=new ArrayList<Movie>();

    public MovieListing(List<Movie> listOfMovies) {
        this.listOfMovies=listOfMovies;
    }

    @Override
    public void displayItems(Console console) {
        StringBuilder list=new StringBuilder();
        //does rating have to be sorted??
        list.append("Movie | Year | Director | Rating\n");
        for (Movie movie : listOfMovies) {
            list.append(movie.getName()+" | ");
            list.append(movie.getYearOfRelease()+" | ");
            list.append(movie.getDirectorsName()+" | ");
            list.append(movie.getRating());
            list.append("\n");

        }
        console.printToConsole(list.toString());
    }
}