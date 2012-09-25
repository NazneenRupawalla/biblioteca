package com.twu28.biblioteca.model;

public class Book {

    private final String name;
    private final int bookCode;

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
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (!(toBeCompared instanceof Book)) return false;

        Book bookToBeCompared = (Book) toBeCompared;

        return name.equals(bookToBeCompared.name) && bookCode == bookToBeCompared.bookCode;

    }
    @Override
    public int hashCode() {
        return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.
    }
}