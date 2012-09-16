package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MembersCollection {

    private static MembersCollection membersInstance=null;
    private List<Member> memberList=new ArrayList<Member>();

    public static MembersCollection getInstance() {
        if(membersInstance==null)
        {
            membersInstance=new MembersCollection();
        }
        return membersInstance;
    }

    private MembersCollection()
    {
        memberList.add(new Member("ABC",190));
        memberList.add(new Member("XYZ",191));


    }

    public List<Member> getListOfLibraryMembers() {
        return memberList;
    }

    public List<Integer> getUIDOfMembers()
    {
        List<Integer> UIDOfMembers=new ArrayList<Integer>();
        for (Member member  : memberList) {
             UIDOfMembers.add(member.getUID());

        }
        return UIDOfMembers;
   }
}
