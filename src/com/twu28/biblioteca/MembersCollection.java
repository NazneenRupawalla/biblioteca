package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembersCollection {

    private static MembersCollection membersInstance=null;
    private List<Member> memberList=new ArrayList<Member>();
    private Map<Integer,String> crediatials=new HashMap<Integer,String>();

    public static MembersCollection getInstance() {
        if(membersInstance==null)
        {
            membersInstance=new MembersCollection();
        }
        return membersInstance;
    }

    private MembersCollection()
    {
        memberList.add(new Member("ABC",111-1111, "abc"));
        memberList.add(new Member("XYZ",222-2222, "xyz"));

    }

    public List<Member> getListOfLibraryMembers() {
        return memberList;
    }





}
