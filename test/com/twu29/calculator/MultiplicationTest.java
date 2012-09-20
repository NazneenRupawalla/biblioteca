package com.twu29.calculator;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

    private Multiplication multiplication;

    @Before
    public void setup()
    {
        multiplication=new Multiplication();
    }
    @Test
    public void testIfCorrectResultIsComputedWhenTwoNumbersAreMultiplied()
    {

        Assert.assertEquals(9.0, multiplication.computeResult(3, 3));

    }

    @Test
    public void testIfCorrectResultIsComputedWhenTwoOrMoreNumbersAreMultiplied()
    {

        Assert.assertEquals(6.0,multiplication.computeResult(1,2,3));

    }

}
