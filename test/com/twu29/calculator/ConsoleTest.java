package com.twu29.calculator;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class ConsoleTest {

    private ConsoleStub console;

    @Before
    public void setup()
    {
        console=new ConsoleStub();

    }

    @Test
    public void testIfAdditionOperationIsTriggered() throws InvalidNumberOfOperandsException {
        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("1,2,3");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals("Result is: 6.0", console.getOutput());

    }

    @Test
    public void testIfSubtractionOperationIsTriggered() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(2);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals("Result is: 2.0", console.getOutput());

    }


    @Test
    public void testIfDivisionOperationIsTriggered() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(4);
        console.setNumbersTakenFromTheConsole("5,2");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals("Result is: 2.5", console.getOutput());

    }

    @Test
    public void testIfAdditionAndMultiplicationAreTriggeredConsecutively() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(3);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();
        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();


        startOperationToGetFinalResult(console);
        Assert.assertEquals("Result is: 18.0", console.getOutput());

    }

    @Test   (expected=NumberFormatException.class)
    public void testOnlyNumbersCanBeAdded() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("-,2");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);


    }

    @Test  (expected=NumberFormatException.class)
    public void testExceptionIsThrownWhenNoNumbersAreEntered() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole(" ");
        console.startRequiredOperation();
        startOperationToGetFinalResult(console);

    }

    @Test   (expected = InvalidNumberOfOperandsException.class)
    public void testInvalidNumberOfOperandsExceptionIsCaught() throws InvalidNumberOfOperandsException {

        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("1");
        console.startRequiredOperation();

    }



    private void startOperationToGetFinalResult(ConsoleStub console) throws InvalidNumberOfOperandsException {
        console.setOptionFromTheUser(5);
        console.startRequiredOperation();
    }
}
