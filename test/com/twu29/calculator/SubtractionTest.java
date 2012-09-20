package com.twu29.calculator;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {

       private Subtraction subtraction;

       @Before
       public void setup()
       {
           subtraction=new Subtraction();
       }

        @Test
        public void testIfCorrectResultIsComputedWhenTwoNumbersAreSubtracted()
        {
            Assert.assertEquals(4.0, subtraction.computeResult(5,1));

        }

        @Test
        public void testIfCorrectNumberIsComputedWhenFirstNumberIsZero()
        {
            Assert.assertEquals(2.0,subtraction.computeResult(0,2));
        }

        @Test
        public void testIfCorrectNumberIsComputedWhenFirstNumberIsSmallerThanTheSecond()
        {
            Assert.assertEquals(-4.0,subtraction.computeResult(1,5));
        }

}
