package com.twu29.calculator;

import java.util.StringTokenizer;

public class ConsoleStub implements IConsole{


    private int menuOption;

    private Calculator calculator=new Calculator();
    private double finalResult;
    private double[] numbers;

    public void setOptionFromTheUser(int menuOption) {
        this.menuOption=menuOption;
    }


    public void setNumbersTakenFromTheConsole(String numberString) throws NumberFormatException{
        //TODO shld use ArrayList

        StringTokenizer tokenizer=new StringTokenizer(numberString,",");
        numbers=new double[tokenizer.countTokens()];
        int count=0;

            while(tokenizer.hasMoreTokens())
            {
                 numbers[count++]=Double.parseDouble(tokenizer.nextToken());
            }


    }

    public void startRequiredOperation() {
        switch(menuOption)
        {
            case 1:
                  calculator.add(numbers);
                  break;
            case 2:
                calculator.subtract(numbers);
                break;
            case 3:
                calculator.multiply(numbers);
                break;
            case 4:
                calculator.divide(numbers);
                break;
            case 5:
                finalResult=calculator.getFinalResult();
                break;

        }
    }

    @Override
    public void takeInputFromConsole() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double printToConsole() {
         return finalResult;
    }
}
