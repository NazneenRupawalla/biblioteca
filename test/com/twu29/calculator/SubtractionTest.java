package com.twu29.calculator;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubtractionTest {

       private Subtraction subtraction;

       @Before
       public void setup()
       {
           subtraction=new Subtraction();
       }

        @Test
        public void testCorrectResultIsComputedWhenTwoNumbersAreSubtracted() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(4.0, subtraction.computeResult(5,1));

        }

        @Test
        public void testCorrectResultIsComputedWhenThreeNumbersAreSubtracted() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(1.0,subtraction.computeResult(6,2,3));
        }

        @Test
        public void testCorrectResultIsComputedWhenFourNumbersAreSubtracted() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(0.0,subtraction.computeResult(8,2,4,2));
        }

        @Test
        public void testCorrectNumberIsComputedWhenFirstNumberIsZero() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(-2.0,subtraction.computeResult(0,2));
        }

        @Test
        public void testCorrectNumberIsComputedWhenFirstNumberIsSmallerThanTheSecond() throws InvalidNumberOfOperandsException {
            Assert.assertEquals(-4.0,subtraction.computeResult(1,5));
        }

        @Test   (expected = NumberFormatException.class)
        public void testOnlyNumbersCanBeSubtracted() throws InvalidNumberOfOperandsException {
            subtraction.computeResult(Double.parseDouble("hello"),8);
        }

        @Test (expected=InvalidNumberOfOperandsException.class)
        public void testExceptionIsThrownWhenNoNumbersAreEntered() throws InvalidNumberOfOperandsException {
            subtraction.computeResult();
        }

        @Test  (expected=InvalidNumberOfOperandsException.class)
        public void testExceptionIsThrownWhenOnlyOneNumberIsEntered() throws InvalidNumberOfOperandsException {
            subtraction.computeResult(1);
        }



}
