package com.twu29.calculator;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
   public void setup()
   {
       calculator=new Calculator();

   }

    @Test
    public void testCorrectResultIsComputedWhenAdditionIsPerformed()
    {
        calculator.add(1, 1, 2);
        Assert.assertEquals(4.0, calculator.getFinalResult());

    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformed()
    {
        calculator.subtract(5,2,1);
        Assert.assertEquals(2.0,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformedAfterAddition()
    {
        calculator.add(1,3,4);
        calculator.subtract(3,2,1);
        Assert.assertEquals(2.0,calculator.getFinalResult());
    }
}
