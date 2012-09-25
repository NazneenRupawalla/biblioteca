package com.twu28.biblioteca.listing;

import com.twu28.biblioteca.Console;
import com.twu28.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieListing implements Printable {


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
            list.append(movie.getName()).append(" | ");
            list.append(movie.getYearOfRelease()).append(" | ");
            list.append(movie.getDirectorsName()).append(" | ");
            list.append(movie.getRating());
            list.append("\n");

        }
        console.printToConsole(list.toString());
    }
}
