package com.twu28.biblioteca.datastore;

import com.twu28.biblioteca.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MembersCollection {

    private static MembersCollection membersInstance=null;
    private final List<Member> memberList=new ArrayList<Member>();

    public static MembersCollection getInstance() {
        if(membersInstance==null)
        {
            membersInstance=new MembersCollection();
        }
        return membersInstance;
    }

    private MembersCollection()
    {
        memberList.add(new Member("ABC","111-1111", "abc"));
        memberList.add(new Member("XYZ","111-1112", "xyz"));

    }

    public List<Member> getListOfLibraryMembers() {
        return memberList;
    }





}
