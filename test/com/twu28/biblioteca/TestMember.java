package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class TestMember {

    @Test
    public void testIfCorrectUIDIsReturned()
    {
        Member member=new Member("ABC",111-1111, "abc");
        Assert.assertEquals(111-1111,member.getUID());
    }
}
