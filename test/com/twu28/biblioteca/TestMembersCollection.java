package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMembersCollection {

    @Test
    public void testInitializationOfLibraryMembers()
    {
        List<Member> member=new ArrayList<Member>();
        member.add(new Member("ABC",190));
        member.add(new Member("XYZ",191));
        Assert.assertEquals(member, MembersCollection.getInstance().getListOfLibraryMembers());
    }

    @Test
    public void testIfListOfUIDNumberIsReturnedSuccessfully()
    {
        List<Integer> UIDs=new ArrayList<Integer>();
        UIDs.add(190);
        UIDs.add(191);
        Assert.assertEquals(UIDs, MembersCollection.getInstance().getUIDOfMembers());
    }
}
