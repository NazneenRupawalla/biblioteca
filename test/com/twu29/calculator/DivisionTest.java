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
    public void testCorrectResultIsComputedWhenABiggerNumberIsDividedByASmallerOne() throws InvalidNumberOfOperandsException {

        Assert.assertEquals(3.0, division.computeResult(9, 3));

    }

    @Test
    public void testCorrectResultIsComputedWhenASmallerNumberIsDividedByAGreaterOne() throws InvalidNumberOfOperandsException {

        Assert.assertEquals(0.5, division.computeResult(1, 2));

    }

    @Test
    public void testDivideByExceptionIsThrownWhenANumberIsDividedByZero() throws InvalidNumberOfOperandsException {
       Assert.assertTrue(Double.isInfinite(division.computeResult(1, 0)));


    }

    @Test
    public void testCorrectResultIsComputedWhenThreeNumbersAreDivided() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(2.0,division.computeResult(16,4,2));
    }

    @Test
    public void testCorrectResultIsComputedWhenFourNumbersAreDivided() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(1.0,division.computeResult(18,9,1,2));
    }

    @Test   (expected = NumberFormatException.class)
    public void testOnlyNumbersCanBeDivided() throws InvalidNumberOfOperandsException {
        division.computeResult(Double.parseDouble("hello"),8);
    }

    @Test  (expected=InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenNoNumbersAreEntered() throws InvalidNumberOfOperandsException {
        division.computeResult();
    }

    @Test  (expected = InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenOnlyOneOperandIsEntered() throws InvalidNumberOfOperandsException {
        division.computeResult(1);
    }



}
