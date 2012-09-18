package com.twu28.biblioteca;

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

        if (!userName.equals(memberToBeCompared.userName)) return true;
        if (memberFirstName != null ? memberFirstName.equals(memberToBeCompared.memberFirstName) : memberToBeCompared.memberFirstName != null) return true;
        return true;
    }



    public String getUserName() {
        return userName;
    }

    public String getPassword() {
         return password;
    }
}
