package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestCredentialsManager {

    @Test
    public void testIfUsernameAndPasswordIsValidatedProperly()
    {
         MemberCredentialsManager manager=new MemberCredentialsManager();
         Assert.assertTrue(manager.validateMember("111-1111","abc"));
    }

    @Test
    public void testIfWrongPasswordForGivenUsernameIsDetectedProperly()
    {
        MemberCredentialsManager manager=new MemberCredentialsManager();
        Assert.assertFalse(manager.validateMember("111-1111","xyz"));
    }

    @Test
    public void testIfWrongUsernameIsDetectedProperly()
    {
        MemberCredentialsManager manager=new MemberCredentialsManager();
        Assert.assertFalse(manager.validateMember("333-3333","xyz"));
    }


}
