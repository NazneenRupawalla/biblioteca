package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

//    @Test
//    public void testLibraryInitialization()
//    {
//        Assert.assertEquals("1.The Girl With A Dragon Tattoo\n2.The Secret\n3.The Monk Who Sold His Ferrari\n", Library.getInstance().viewBooksInLibrary());
//    }
//
//    @Test
//    public void testIfListOfBookCodeIdIsReturnedSuccessfully()
//    {
//
//        List<Integer> bookIDList=new ArrayList<Integer>();
//        bookIDList.add(1);
//        bookIDList.add(2);
//        bookIDList.add(3);
//        Assert.assertEquals(bookIDList,Library.getInstance().getBooksCodeId());
//    }


    @Test
    public void testOnlyOneInstanceOfLibraryIsCreated()
    {
        Assert.assertEquals(Library.getInstance(), Library.getInstance());
    }

    @Test
    public void testListOfBooksIsReturnedSuccessfully()
    {
        List<Book> books=new ArrayList<Book>();
        books.add(new Book("The Girl With A Dragon Tattoo",1));
        books.add(new Book("The Secret",2));
        books.add(new Book("The Monk Who Sold His Ferrari",3));
        Assert.assertEquals(books,Library.getInstance().getListOfBooksToMaintainAvailabilityStatus());
    }
}
