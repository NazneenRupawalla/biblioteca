package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCredentialsManager {

    private MemberCredentialsManager manager;

    @Before
    public void setup()
    {
       manager=new MemberCredentialsManager();

    }

    @Test
    public void testIfUsernameAndPasswordIsValidatedProperly()
    {
         Assert.assertTrue(manager.validateMember("111-1111","abc"));
    }

    @Test
    public void testIfWrongPasswordForGivenUsernameIsDetectedProperly()
    {
        Assert.assertFalse(manager.validateMember("111-1111","xyz"));
    }

    @Test
    public void testIfWrongUsernameIsDetectedProperly()
    {
        Assert.assertFalse(manager.validateMember("333-3333","xyz"));
    }


}
