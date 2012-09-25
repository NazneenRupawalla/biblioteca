package com.twu28.biblioteca.datastore;


import com.twu28.biblioteca.datastore.MembersCollection;
import com.twu28.biblioteca.model.Member;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MembersCollectionTest {

    @Test
    public void testInitializationOfLibraryMembers()
    {
        List<Member> member=new ArrayList<Member>();
        member.add(new Member("ABC","111-1111","abc"));
        member.add(new Member("XYZ","111-1112","xyz"));
        Assert.assertEquals(member, MembersCollection.getInstance().getListOfLibraryMembers());
    }


}
