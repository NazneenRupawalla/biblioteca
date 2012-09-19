package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testIfABookIsInitializedProperly()
    {
        Book fictionBook=new Book("Coma",1);
        Assert.assertEquals("Coma",fictionBook.getName());
        Assert.assertEquals(1,fictionBook.getID());
    }

}
