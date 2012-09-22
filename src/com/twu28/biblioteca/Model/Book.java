package com.twu28.biblioteca.Model;

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
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (!(toBeCompared instanceof Book)) return false;

        Book bookToBeCompared = (Book) toBeCompared;

        if (!name.equals(bookToBeCompared.name)) return false;
        if(!(bookCode==bookToBeCompared.bookCode)) return false;

        return true;
    }
    @Override
    public int hashCode() {
        return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.
    }
}