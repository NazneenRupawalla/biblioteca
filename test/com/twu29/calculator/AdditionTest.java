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
    public void testCorrectResultIsComputedWhenTwoNumbersAreAdded() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(6.0,addition.computeResult(3,3));

    }

    @Test
    public void testCorrectResultIsComputedWhenThreeNumbersAreAdded() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(9.0,addition.computeResult(2,4,3));

    }

    @Test
    public void testCorrectResultIsComputedWhenFourNumbersAreAdded() throws InvalidNumberOfOperandsException {
        Assert.assertEquals(18.0,addition.computeResult(2,6,1,9));
    }

    @Test   (expected = NumberFormatException.class)
    public void testOnlyNumbersCanBeAdded() throws InvalidNumberOfOperandsException {
        addition.computeResult(Double.parseDouble("-"),8);
    }

    @Test  (expected=InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenNoNumbersAreEntered() throws InvalidNumberOfOperandsException {
        addition.computeResult();
    }

    @Test  (expected = InvalidNumberOfOperandsException.class)
    public void testExceptionIsThrownWhenOnlyOneOperandIsEntered() throws InvalidNumberOfOperandsException {
        addition.computeResult(1);
    }






}
