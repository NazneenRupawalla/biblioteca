package com.twu29.calculator;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

    private Addition addition;

    @Before
    public void setup()
    {
        addition=new Addition();

    }

    @Test
    public void testIfCorrectResultIsComputedWhenTwoNumbersAreAdded()
    {
            Assert.assertEquals(6.0,addition.computeResult(3,3));

    }

    @Test
    public void testIfCorrectResultIsComputedWhenTwoOrMoreNumbersAreAdded()
    {
        Assert.assertEquals(6.0,addition.computeResult(1,2,3));

    }

    @Test   (expected = NumberFormatException.class)
    public void testOnlyNumbersCanBeAdded()
    {
        addition.computeResult(Double.parseDouble("-"),8);
    }


}
