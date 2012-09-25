package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ConsoleStubTest {

    private ConsoleStub stub;

    @Before
    public void setup()
    {
        stub=new ConsoleStub();

    }

    private void setCredentialsOfUser(ConsoleStub stub) {
        stub.setLoginCredentialsFromUser("111-1111");
        stub.setLoginCredentialsFromUser("abc");
    }

    @Test  (expected=NumberFormatException.class)
    public void testOnlyNumbersCanBeEnteredForSelectingAMenuOption() throws IOException {
        stub.setInputTakenFromUser("h");
        stub.startTheRequiredProcess();
    }

    @Test
    public void testViewBooksOptionFromTheMenuIsTriggered() throws IOException {
        stub.setInputTakenFromUser("1");
        stub.startTheRequiredProcess();
        String books="ID.BookName\n1.The Girl With A Dragon Tattoo\n2.The Secret\n3.The Monk Who Sold His Ferrari\n";
        Assert.assertEquals(books,stub.getRequiredOutputToBePrintedOnConsole());

    }


    @Test
    public void testViewMoviesOptionFromTheMenuIsTriggered() throws IOException {
        stub.setInputTakenFromUser("4");
        stub.startTheRequiredProcess();
        String books="Movie | Year | Director | Rating\nThe Shawshank Redemption | 1994 | Frank Darabont | 9.3\nSwades | 2004 | Ashutosh Gowarikar | 9.5\n";
        Assert.assertEquals(books,stub.getRequiredOutputToBePrintedOnConsole());

    }
    @Test
    public void testReservingBookWithIDOne() throws IOException {
        stub.setInputTakenFromUser("2");
        setCredentialsOfUser(stub);

        stub.startTheRequiredProcess();

        Assert.assertEquals("Thank you!Enjoy the Book",stub.getRequiredOutputToBePrintedOnConsole());
    }


    @Test
    public void testReservingBookWithIDOneTwice() throws IOException {
        stub.setInputTakenFromUser("2");
        setCredentialsOfUser(stub);

        stub.startTheRequiredProcess();

        stub.setInputTakenFromUser("2");
        setCredentialsOfUser(stub);

        stub.startTheRequiredProcess();

        Assert.assertEquals("We do not have the book yet",stub.getRequiredOutputToBePrintedOnConsole());

    }

    @Test
    public void testReturningLibraryCardNumberToMember() throws IOException {
        stub.setInputTakenFromUser("3");
        stub.startTheRequiredProcess();
        Assert.assertEquals("Please talk to the Librarian. Thank you.",stub.getRequiredOutputToBePrintedOnConsole());
    }

    @Test
    public void testInvalidOptionByTheUserIsDetected() throws IOException {
        stub.setInputTakenFromUser("6");
        stub.startTheRequiredProcess();
        Assert.assertEquals("Invalid Option",stub.getRequiredOutputToBePrintedOnConsole());
    }

}
