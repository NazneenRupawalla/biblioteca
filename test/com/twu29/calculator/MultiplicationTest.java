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
    public void testCorrectResultIsComputedWhenTwoNumbersAreMultiplied() throws InvalidNumberOfOperandsException {

        Assert.assertEquals(9.0, multiplication.computeResult(3, 3));

    }

    @Test
    public void testCorrectResultIsComputedWhenThreeNumbersAreMultiplied() throws InvalidNumberOfOperandsException {

        Assert.assertEquals(6.0,multiplication.computeResult(1,2,3));

    }

    @Test
    public void testCorrectResultIsComputedWhenFourNumbersAreMultiplied() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(40.0,multiplication.computeResult(2,4,5.0,1));
    }

    @Test
    public void testCorrectResultIsObtainedWhenANegativeValueIsPassed() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(-6.0,multiplication.computeResult(1,-2,3));

    }

    @Test
    public void testZeroIsObtainedWhenIfOneNumberEnteredIsZero() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(0.0,multiplication.computeResult(0,-2,3));

    }


    @Test   (expected = NumberFormatException.class)
    public void testOnlyNumbersCanBeMultiplied() throws InvalidNumberOfOperandsException {
        multiplication.computeResult(Double.parseDouble("hello"),8);
    }

    @Test (expected = InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenNoNumbersAreEntered() throws InvalidNumberOfOperandsException {
        multiplication.computeResult();
    }

    @Test  (expected = InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenOnlyOneOperandIsEntered() throws InvalidNumberOfOperandsException {
        multiplication.computeResult(1);
    }




}
