package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemManager implements Printable {

    Library publicLibrary=null;
    Map<Integer,Boolean> bookAvailability=new HashMap<Integer,Boolean>();
    public static Map<Integer, Integer> libraryCardNumToMemberUID =new HashMap<Integer, Integer>();
    public static int libraryNum=1;
    private List<Book> books=new ArrayList<Book>();
    private Console console;
    private MemberCredentialsManager loginManager;

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
        displayItems();
    }

    public String displayAvailabilityStatusOfBooks() {
        return bookAvailability.toString();

    }
     //TODO ask user for lib card number and associate book with the member
    public Boolean reserveBookWithGivenID(int bookID) {
        //checkIfUserIsAMember();
        Boolean availability=bookAvailability.get(bookID);
        if(!availability)
        {
            console.printToConsole("We do not have the book yet");
            return Boolean.FALSE;
        }
        updateAvailabilityStatusOfBook(bookID, Boolean.FALSE);
        console.printToConsole("Thank you!Enjoy the Book");
        return Boolean.TRUE;
           // return issueBookToMember(bookID);

    }

    private void updateAvailabilityStatusOfBook(int bookID, Boolean status) {
        bookAvailability.remove(bookID);
        bookAvailability.put(bookID,status);
    }


    @Override
    public void displayItems() {
        StringBuilder booksList=new StringBuilder();
        for (Book book : books) {
            booksList.append(book.getID());
            booksList.append(".");
            booksList.append(book.getName().trim());
            booksList.append("\n");

        }
        console.printToConsole(booksList.toString());
    }

    public void setLibraryConsole(Console console) {
        this.console=console;
    }
}