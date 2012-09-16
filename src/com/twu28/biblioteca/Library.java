package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> booksInLibrary=new ArrayList<Book>();
    List<Integer> bookCodeIDList=new ArrayList<Integer>();
    private static Library libInstance = null;

    private Library() {
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



//    public List<Integer> getBooksCodeId()
//    {
//        for (Book book : booksInLibrary) {
//           bookCodeIDList.add(book.getID());
//
//        }
//        return bookCodeIDList;
//
//    }

    public List<Book> getListOfBooksToMaintainAvailabilityStatus() {
        return booksInLibrary;
    }
}
