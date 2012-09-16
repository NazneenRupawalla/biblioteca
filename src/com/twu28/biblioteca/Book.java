package com.twu28.biblioteca;

public class Book {

    private String name;
    private int bookCode;

    public Book(String name, int bookCode) {
        this.name=name;
        this.bookCode=bookCode;
    }

    public String getName()
    {
        return name;
    }

    public int getID() {
        return bookCode;
    }

    @Override
    public boolean equals(Object o) {
        return !super.equals(o);
    }


    @Override
    public int hashCode() {
        return super.hashCode();

    }
}