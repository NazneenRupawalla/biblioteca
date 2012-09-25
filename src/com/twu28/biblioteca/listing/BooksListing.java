package com.twu28.biblioteca.listing;

import com.twu28.biblioteca.Console;
import com.twu28.biblioteca.Printable;
import com.twu28.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksListing implements Printable {

    private List<Book> books=new ArrayList<Book>();

    public BooksListing(List<Book> books) {
        this.books=books;
    }


    @Override
    public void displayItems(Console console) {

            StringBuilder list=new StringBuilder();
            list.append("ID.BookName\n");
            for (Book book : books) {
                list.append(book.getID());
                list.append(".");
                list.append(book.getName().trim());
                list.append("\n");

            }
            console.printToConsole(list.toString());
        }

}
