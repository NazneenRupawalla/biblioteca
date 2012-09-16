package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestConsoleStub {

    @Test
    public void testViewBooksOptionFromTheMenuIsTriggered() throws IOException {
        ConsoleStub stub=new ConsoleStub();
        stub.setMenuOptionTakenFromUser(1);
      //  stub.takeInputFromConsole();
        stub.startTheRequiredProcess();
        String books="1.The Girl With A Dragon Tattoo\n2.The Secret\n3.The Monk Who Sold His Ferrari\n";
        Assert.assertEquals(books,stub.getRequiredInputToBePrintedOnConsole());

    }


}
