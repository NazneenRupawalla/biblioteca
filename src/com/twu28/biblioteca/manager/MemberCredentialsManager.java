package com.twu28.biblioteca.manager;

import com.twu28.biblioteca.datastore.MembersCollection;
import com.twu28.biblioteca.model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberCredentialsManager {

    private List<Member> members=new ArrayList<Member>();
    private Map<String,String> credentials=new HashMap<String,String>();

    public MemberCredentialsManager()
    {
        members= MembersCollection.getInstance().getListOfLibraryMembers();
        initializeTheLoginCredentialsList();
    }


    private void initializeTheLoginCredentialsList()
    {

        for (Member member : members) {
            credentials.put(member.getUserName(),member.getPassword());
        }

    }

    public Boolean validateMember(String userName, String password)
    {
        for (Map.Entry<String, String> integerStringEntry : credentials.entrySet()) {
             return (integerStringEntry.getKey().equals(userName) && integerStringEntry.getValue().equals(password));
        }
        return false;
    }

}
