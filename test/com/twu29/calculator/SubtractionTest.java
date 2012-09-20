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




}
