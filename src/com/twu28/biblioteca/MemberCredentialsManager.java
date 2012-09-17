package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberCredentialsManager {

    private List<Member> members=new ArrayList<Member>();
    private Map<Integer,String> credentials=new HashMap<Integer,String>();

    public MemberCredentialsManager()
    {
        members=MembersCollection.getInstance().getListOfLibraryMembers();
        initializeTheLoginCredentialsList();
    }


    private void initializeTheLoginCredentialsList()
    {

        for (Member member : members) {
            credentials.put(member.getUID(),member.getPassword());
        }

    }

    public Boolean validateMember(int userName, String password)
    {
        for (Map.Entry<Integer, String> integerStringEntry : credentials.entrySet()) {
             return (integerStringEntry.getKey()==userName && integerStringEntry.getValue().equals(password));
        }
        return false;
    }

}
