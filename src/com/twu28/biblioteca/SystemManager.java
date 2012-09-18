package com.twu28.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager {

    private Library publicLibrary=null;
    private Map<Integer,Boolean> bookAvailability=new HashMap<Integer,Boolean>();
    private List<Book> books=new ArrayList<Book>();
    private Console console;
    private MemberCredentialsManager loginManager;
    private String userName;
    private Map<String,Integer> memeberIDToBookID=new HashMap<String, Integer>();

    public SystemManager() {

      initializeTheSystem();

    }

    private void initializeTheSystem() {
        publicLibrary=Library.getInstance();
        books=publicLibrary.getListOfBooksToMaintainAvailabilityStatus();
        for (Book book : books) {
            bookAvailability.put(book.getID(),Boolean.TRUE);
        }
        loginManager=new MemberCredentialsManager();

    }

    //TODO see if two copies of a book are present
    public void displayBooksTheLibraryOwns() {
        BooksListing listOfBooks=new BooksListing(books);
        listOfBooks.displayItems(console);
    }

    public String displayAvailabilityStatusOfBooks() {
        return bookAvailability.toString();

    }

    public Boolean reserveBookWithGivenID(int bookID) throws IOException {
        if(!checkIfUserIsAMember()){
            console.printToConsole("Please check your login credentials");
            return false;
        }
        Boolean availability=bookAvailability.get(bookID);
        if(!availability)
        {
            console.printToConsole("We do not have the book yet");
            return Boolean.FALSE;
        }
        updateAvailabilityStatusOfBook(bookID, Boolean.FALSE);
        console.printToConsole("Thank you!Enjoy the Book");
        issueBookToMember(bookID);
        return Boolean.TRUE;

    }

    private void issueBookToMember(int bookID) {
        memeberIDToBookID.put(userName,bookID);
    }

    private Boolean checkIfUserIsAMember() throws IOException {
        console.printToConsole("Please Login:\nEnter your Username:");
        userName=console.takeInputFromConsole();
        console.printToConsole("Enter your password:");
        String password=console.takeInputFromConsole();
        //Tell-dont ask???
        return loginManager.validateMember(userName,password);
    }

    private void updateAvailabilityStatusOfBook(int bookID, Boolean status) {
        bookAvailability.remove(bookID);
        bookAvailability.put(bookID,status);
    }




    public void setLibraryConsole(Console console) {
        this.console=console;
    }

    public void displayMoviesTheLibraryOwns() {
        MovieListing listOfMovies=new MovieListing(publicLibrary.getListOfMovies());
        listOfMovies.displayItems(console);
    }
}