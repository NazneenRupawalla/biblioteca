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
        member.add(new Member("ABC",111-1111,"abc"));
        member.add(new Member("XYZ",222-2222,"xyz"));
        Assert.assertEquals(member, MembersCollection.getInstance().getListOfLibraryMembers());
    }


}
