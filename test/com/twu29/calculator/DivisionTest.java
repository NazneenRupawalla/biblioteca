package com.twu29.calculator;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.NameNotFoundException;

public class DivisionTest {

    private Division division;

    @Before
    public void setup()
    {
        division=new Division();
    }
    @Test
    public void testIfCorrectResultIsComputedWhenABiggerNumberIsDividedByASmallerOne()
    {

        Assert.assertEquals(3.0, division.computeResult(9, 3));

    }

    @Test
    public void testIfCorrectResultIsComputedWhenASmallerNumberIsDividedByAGreaterOne()
    {

        Assert.assertEquals(0.5, division.computeResult(1, 2));

    }

    @Test
    public void testIfDivideByExceptionIsThrownWhenANumberIsDividedByZero()
    {
       Assert.assertTrue(Double.isInfinite(division.computeResult(1, 0)));


    }

}
