package com.twu29.calculator;

public class Addition implements IOperation{

    @Override
    public double computeResult(double... numbers) throws InvalidNumberOfOperandsException {
        if(numbers==null || numbers.length<2)
            throw new InvalidNumberOfOperandsException("Enter atleast two numbers");
        double sum=0;

        for (double number : numbers) {
              sum=sum+number;

        }

    return sum;
    }

}
