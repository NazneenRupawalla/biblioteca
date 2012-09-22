package com.twu29.calculator;


import junit.framework.Assert;
import org.junit.Test;


public class ConsoleTest {

    @Test
    public void testIfAdditionOperationIsTriggered()
    {
        ConsoleStub console=new ConsoleStub();
        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("1,2,3");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals(6.0, console.printToConsole());

    }

    @Test
    public void testIfSubtractionOperationIsTriggered()
    {
        ConsoleStub console=new ConsoleStub();
        console.setOptionFromTheUser(2);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals(2.0, console.printToConsole());

    }


    @Test
    public void testIfDivisionOperationIsTriggered()
    {
        ConsoleStub console=new ConsoleStub();
        console.setOptionFromTheUser(4);
        console.setNumbersTakenFromTheConsole("5,2");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        Assert.assertEquals(2.5, console.printToConsole());

    }

    @Test
    public void testIfAdditionAndMultiplicationAreTriggeredConsecutively()
    {
        ConsoleStub console=new ConsoleStub();
        console.setOptionFromTheUser(3);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();
        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("5,2,1");
        console.startRequiredOperation();


        startOperationToGetFinalResult(console);
        Assert.assertEquals(18.0, console.printToConsole());

    }

    @Test   (expected=NumberFormatException.class)
    public void testOnlyNumbersCanBeAdded()
    {
        ConsoleStub console=new ConsoleStub();
        console.setOptionFromTheUser(1);
        console.setNumbersTakenFromTheConsole("-,2");
        console.startRequiredOperation();

        startOperationToGetFinalResult(console);
        console.printToConsole();

    }






    private void startOperationToGetFinalResult(ConsoleStub console) {
        console.setOptionFromTheUser(5);
        console.startRequiredOperation();
    }
}
