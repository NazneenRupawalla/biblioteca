package com.twu28.biblioteca.model;


import com.twu28.biblioteca.model.Member;
import junit.framework.Assert;
import org.junit.Test;

public class MemberTest {

    @Test
    public void testIfCorrectUIDIsReturned()
    {
        Member member=new Member("ABC","111-1111", "abc");
        Assert.assertEquals("111-1111",member.getUserName());
    }
}
