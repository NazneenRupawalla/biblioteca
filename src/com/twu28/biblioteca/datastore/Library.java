package com.twu28.biblioteca.datastore;

import com.twu28.biblioteca.listing.BooksListing;
import com.twu28.biblioteca.Console;
import com.twu28.biblioteca.listing.MovieListing;
import com.twu28.biblioteca.model.Book;
import com.twu28.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final List<Book> booksInLibrary=new ArrayList<Book>();
    private static Library libInstance = null;
    private final List<Movie> movieCollection=new ArrayList<Movie>();
    private Console console;
    private final Map<Integer, Boolean> bookAvailability=new HashMap<Integer, Boolean>();

    private Library() {
        addBooks();
        addMovies();
        for (Book book : booksInLibrary) {
            bookAvailability.put(book.getID(),Boolean.TRUE);
        }

    }

    private void addMovies() {
        movieCollection.add(new Movie("The Shawshank Redemption",1994,"Frank Darabont",9.3));
        movieCollection.add(new Movie("Swades",2004,"Ashutosh Gowarikar",9.5));
//        movieCollection.add(new Movie("Forest Gump",1994,"Robert Zemeckis",8.7));
//        movieCollection.add(new Movie("Sarfarosh",1999,"John Mattan",7.8));
//        movieCollection.add(new Movie("The Terminal",2004,"Steven Spielberg",7.2));
//        movieCollection.add(new Movie("Shool",1999,"E.Nivas",9.8));
//        movieCollection.add(new Movie("Catch Me If You Can",2002,"Steven Spielberg",7.9));
//        movieCollection.add(new Movie("Dil Chahta Hai",1994,"Farhan Akhtar",9.6));

    }

    private void addBooks() {
        booksInLibrary.add(new Book("The Girl With A Dragon Tattoo",1));
        booksInLibrary.add(new Book("The Secret",2));
        booksInLibrary.add(new Book("The Monk Who Sold His Ferrari",3));
    }

    public static Library getInstance() {
        if(libInstance==null)
        {
             libInstance=new Library();
        }
        return libInstance;
    }



    public void displayBooksTheLibraryOwns() {
        BooksListing listOfBooks=new BooksListing(booksInLibrary);
        listOfBooks.displayItems(console);

    }

    public void setConsole(Console console) {
        this.console=console;
    }

    public Boolean reserveBookWithGivenID(int bookID) {
        Boolean availability=bookAvailability.get(bookID);
        if(!availability)
        {
            console.printToConsole("We do not have the book yet");
            return Boolean.FALSE;
        }
        updateAvailabilityStatusOfBook(bookID);
        console.printToConsole("Thank you!Enjoy the Book");
        //issueBookToMember(bookID);
        return Boolean.TRUE;

    }

    private void updateAvailabilityStatusOfBook(int bookID) {
        bookAvailability.remove(bookID);
        bookAvailability.put(bookID, Boolean.FALSE);
    }

    public void displayMoviesTheLibraryOwns() {
        MovieListing listOfMovies=new MovieListing(movieCollection);
        listOfMovies.displayItems(console);
    }

    public static void destroyInstance() {
        libInstance=null;
    }
}
