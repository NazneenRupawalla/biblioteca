package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestSystemManager {

//    @Test
//    public void testIfViewBooksMenuOptionIsWorking()
//    {
//        SystemManager libraryManager=new SystemManager();
//        String books="1.The Girl With A Dragon Tattoo\n2.The Secret\n3.The Monk Who Sold His Ferrari\n";
//        Assert.assertEquals(books, libraryManager.displayBooksTheLibraryOwns());
//    }

    @Test
    public void testBooksAvailabilityStatusWhenLibraryManagerIsInitialized()
    {
        SystemManager systemManager =new SystemManager();
        systemManager.setLibraryConsole(new LibraryConsole());
        Map<Integer,Boolean> testBookAvailabilityList=new HashMap<Integer,Boolean>();
        testBookAvailabilityList.put(1,Boolean.TRUE);
        testBookAvailabilityList.put(2,Boolean.TRUE);
        testBookAvailabilityList.put(3,Boolean.TRUE);


        Assert.assertEquals(testBookAvailabilityList.toString(), systemManager.displayAvailabilityStatusOfBooks());

    }

    @Test
    public void testBookIsIssuedWhenAnAvailableBookIsReserved()
    {
        SystemManager systemManager =new SystemManager();
        systemManager.setLibraryConsole(new LibraryConsole());

        Assert.assertTrue(systemManager.reserveBookWithGivenID(1));
    }

    @Test
    public void testIfOnceAnAvailableBookIsReservedItCannotBeReservedAgain()
    {
        SystemManager systemManager =new SystemManager();
        systemManager.setLibraryConsole(new LibraryConsole());

        systemManager.reserveBookWithGivenID(2);
        Assert.assertFalse("We do not have the book yet", systemManager.reserveBookWithGivenID(2));
    }



}
