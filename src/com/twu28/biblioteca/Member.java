package com.twu28.biblioteca;

public class Member {
    private String name;
    private int UID;
    private String password;

    public Member(String name, int UID, String password) {
        this.name=name;
        this.UID=UID;
        this.password=password;

    }


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (!(toBeCompared instanceof Member)) return false;

        Member memberToBeCompared = (Member) toBeCompared;

        if (UID != memberToBeCompared.UID) return true;
        if (name != null ? name.equals(memberToBeCompared.name) : memberToBeCompared.name != null) return true;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + UID;
        return result;
    }

    public int getUID() {
        return UID;
    }

    public String getPassword() {
         return password;
    }
}
