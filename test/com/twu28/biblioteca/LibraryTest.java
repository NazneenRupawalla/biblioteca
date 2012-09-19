package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryTest {

    @Before
    public void setup()
    {
       Library.destroyInstance();
    }


    @Test
    public void testOnlyOneInstanceOfLibraryIsCreated()
    {
        Assert.assertEquals(Library.getInstance(), Library.getInstance());
    }


    @Test
    public void testBookIsIssuedWhenAnAvailableBookIsReserved() throws IOException {
        ConsoleStub stub=new ConsoleStub();
        setMemberCredentials(stub);
        Library.getInstance().setConsole(stub);
        Assert.assertTrue(Library.getInstance().reserveBookWithGivenID(1));
    }

    @Test
    public void testIfOnceAnAvailableBookIsReservedItCannotBeReservedAgain() throws IOException {
        ConsoleStub stub=new ConsoleStub();
        Library.getInstance().setConsole(stub);

        setMemberCredentials(stub);
        Library.getInstance().reserveBookWithGivenID(2);

        setMemberCredentials(stub);

        Assert.assertFalse(Library.getInstance().reserveBookWithGivenID(2));
    }

    private void setMemberCredentials(ConsoleStub stub) {
        stub.setLoginCredentialsFromUser("111-1111");
        stub.setLoginCredentialsFromUser("abc");
    }


}
