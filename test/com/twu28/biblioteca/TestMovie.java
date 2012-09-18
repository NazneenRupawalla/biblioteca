package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestMovie {

    @Test
    public void testInitializationOfAMovie()
    {
        Movie movie=new Movie("The Shawshank Redemption",1994,"Frank Darabont",9.3);
        Assert.assertEquals("The Shawshank Redemption",movie.getName());
        Assert.assertEquals(1994,movie.getYearOfRelease());
        Assert.assertEquals("Frank Darabont",movie.getDirectorsName());
        Assert.assertEquals(9.3,movie.getRating());

    }
}
