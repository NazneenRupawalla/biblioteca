package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestConsoleStub {

    @Test
    public void testViewBooksOptionFromTheMenuIsTriggered() throws IOException {
        ConsoleStub stub=new ConsoleStub();
        stub.setInputTakenFromUser(1);
      //  stub.takeInputFromConsole();
        stub.startTheRequiredProcess();
        String books="1.The Girl With A Dragon Tattoo\n2.The Secret\n3.The Monk Who Sold His Ferrari\n";
        Assert.assertEquals(books,stub.getRequiredOutputToBePrintedOnConsole());

    }

    @Test
    public void testReservingBookWithIDOne()
    {
        ConsoleStub stub=new ConsoleStub();
        stub.setInputTakenFromUser(2);
        stub.startTheRequiredProcess();
        Assert.assertEquals("Thank you!Enjoy the Book",stub.getRequiredOutputToBePrintedOnConsole());
    }

    @Test
    public void testReservingBookWithIDOneTwice()
    {
        ConsoleStub stub=new ConsoleStub();
        stub.setInputTakenFromUser(2);
        stub.startTheRequiredProcess();
        stub.setInputTakenFromUser(2);
        stub.startTheRequiredProcess();
        Assert.assertEquals("We do not have the book yet",stub.getRequiredOutputToBePrintedOnConsole());

    }

    @Test
    public void testReturningLibraryCardNumberToMember()
    {
        ConsoleStub stub=new ConsoleStub();
        stub.setInputTakenFromUser(3);
        stub.startTheRequiredProcess();
        Assert.assertEquals("Library Card Number:1",stub.getRequiredOutputToBePrintedOnConsole());
    }

    @Test
    public void testInvalidOptionByTheUserIsDetected()
    {
        ConsoleStub stub=new ConsoleStub();
        stub.setInputTakenFromUser(5);
        stub.startTheRequiredProcess();
        Assert.assertEquals("Invalid Option",stub.getRequiredOutputToBePrintedOnConsole());
    }




}
