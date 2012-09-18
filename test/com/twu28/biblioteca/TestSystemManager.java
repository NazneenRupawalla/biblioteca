package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
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
       // systemManager.setLibraryConsole(new ConsoleStub());
        Map<Integer,Boolean> testBookAvailabilityList=new HashMap<Integer,Boolean>();
        testBookAvailabilityList.put(1,Boolean.TRUE);
        testBookAvailabilityList.put(2,Boolean.TRUE);
        testBookAvailabilityList.put(3,Boolean.TRUE);


        Assert.assertEquals(testBookAvailabilityList.toString(), systemManager.displayAvailabilityStatusOfBooks());

    }

    @Test
    public void testBookIsIssuedWhenAnAvailableBookIsReserved() throws IOException {
        SystemManager systemManager =new SystemManager();
        ConsoleStub stub=new ConsoleStub();
        setMemberCredentials(stub);
        systemManager.setLibraryConsole(stub);

        Assert.assertTrue(systemManager.reserveBookWithGivenID(1));
    }

    private void setMemberCredentials(ConsoleStub stub) {
        stub.setLoginCredentialsFromUser("111-1111");
        stub.setLoginCredentialsFromUser("abc");
    }

    @Test
    public void testIfOnceAnAvailableBookIsReservedItCannotBeReservedAgain() throws IOException {
        SystemManager systemManager =new SystemManager();
        ConsoleStub stub=new ConsoleStub();
        setMemberCredentials(stub);
        systemManager.setLibraryConsole(stub);

        systemManager.reserveBookWithGivenID(2);
        setMemberCredentials(stub);

        Assert.assertFalse(systemManager.reserveBookWithGivenID(2));
    }



}
