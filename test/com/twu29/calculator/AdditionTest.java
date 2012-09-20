package com.twu29.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void testIfCorrectResultIsComputedWhenTwoNumbersAreAdded()
    {
            Addition addition=new Addition();
            Assert.assertEquals(6.0,addition.computeResult(3,3));

    }

    @Test
    public void testIfCorrectResultIsComputedWhenTwoOrMoreNumbersAreAdded()
    {
        Addition addition=new Addition();
        Assert.assertEquals(6.0,addition.computeResult(1,2,3));

    }


}
