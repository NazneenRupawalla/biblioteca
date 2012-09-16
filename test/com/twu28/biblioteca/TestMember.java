package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class TestMember {

    @Test
    public void testIfCorrectUIDIsReturned()
    {
        Member member=new Member("ABC",190);
        Assert.assertEquals(190,member.getUID());
    }
}
