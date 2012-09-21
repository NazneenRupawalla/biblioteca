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
        calculator.add(1,1,2);
        Assert.assertEquals(4.0, calculator.getFinalResult());

    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformed()
    {
        calculator.subtract(5,2,1);
        Assert.assertEquals(2.0,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenMultiplicationIsPerformed()
    {
        calculator.multiply(4,5,6);
        Assert.assertEquals(120.0,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenDivisionIsPerformed()
    {
        calculator.divide(7,4);
        Assert.assertEquals(1.75,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformedAfterAddition()
    {
        calculator.add(1,3,4);
        calculator.subtract(3,2,1);
        Assert.assertEquals(2.0,calculator.getFinalResult());
    }


    @Test
    public void testCorrectResultIsComputedWhenAdditionIsPerformedAfterSubtraction()
    {
        calculator.subtract(3,2,1);
        calculator.add(1,3,4);

        Assert.assertEquals(8.0,calculator.getFinalResult());

    }

    @Test
    public void testCorrectResultIsComputedWhenAdditionIsPerformedAfterMultiplication()
    {
        calculator.multiply(3,2,1);
        calculator.add(1,3,4);

        Assert.assertEquals(14.0,calculator.getFinalResult());

    }

    @Test
    public void testCorrectResultIsComputedWhenAdditionIsPerformedAfterDivision()
    {
        calculator.divide(4,2);
        calculator.add(1,3,4);

        Assert.assertEquals(10.0,calculator.getFinalResult());

    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformedAfterMultiplication()
    {
        calculator.multiply(1,3,4);
        calculator.subtract(2,4);
        Assert.assertEquals(6.0,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenSubtractionIsPerformedAfterDivision()
    {
        calculator.divide(12,4);
        calculator.subtract(3);
        Assert.assertEquals(0.0,calculator.getFinalResult());
    }



    @Test
    public void testCorrectResultIsComputedWhenDivisionIsPerformedAfterAddition()
    {
        calculator.add(12,4);
        calculator.divide(2);
        Assert.assertEquals(8.0,calculator.getFinalResult());
    }

    @Test
    public void testCorrectResultIsComputedWhenMultiplicationIsPerformedAfterDivision()
    {
        calculator.divide(6,3);
        calculator.multiply(3);
        Assert.assertEquals(6.0,calculator.getFinalResult());
    }

}
