package com.twu28.biblioteca.model;

public class Member {
    private String memberFirstName;
    private String userName;
    private String password;

    public Member(String name, String username, String password) {
        this.memberFirstName=name;
        this.userName=username;
        this.password=password;

    }


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (!(toBeCompared instanceof Member)) return false;

        Member memberToBeCompared = (Member) toBeCompared;

        if (!userName.equals(memberToBeCompared.userName)) return false;

        if(!memberFirstName.equals(memberToBeCompared.memberFirstName)) return false;
        if(!password.equals(memberToBeCompared.password)) return false;

        return true;
    }



    public String getUserName() {
        return userName;
    }

    public String getPassword() {
         return password;
    }
}
