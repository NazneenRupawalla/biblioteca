package com.twu29.calculator;

public class Division implements IOperation{

    @Override
    public double computeResult(double...numbers) throws InvalidNumberOfOperandsException {
        if(numbers==null || numbers.length<2)
            throw new InvalidNumberOfOperandsException("Enter atleast two numbers");

        double divisionResult=numbers[0];
        for(int indexOfArray=1;indexOfArray<=numbers.length-1;indexOfArray++)
        {
            divisionResult=divisionResult/numbers[indexOfArray];
        }

        return divisionResult;
    }

}
