package com.twu29.calculator;

import java.util.StringTokenizer;

public class ConsoleStub implements IConsole{


    private int menuOption;

    private final Calculator calculator=new Calculator();

    private double[] numbers;
    private String output;

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

    public void startRequiredOperation() throws InvalidNumberOfOperandsException {
        try
        {
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
                printToConsole("Result is: " + calculator.getFinalResult());
                break;

        }
        }catch(InvalidNumberOfOperandsException exception)
        {
            throw new InvalidNumberOfOperandsException("Caught Exception");
        }
    }

    @Override
    public double takeInputFromConsole() {
        return 0.0;
    }

    @Override
    public void printToConsole(String output) {
         this.output=output;
    }

    public String getOutput() {
          return output;
    }
}
