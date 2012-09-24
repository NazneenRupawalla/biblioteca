package com.twu29.calculator;

public class Multiplication implements IOperation{


    @Override
    public double computeResult(double... numbers) throws InvalidNumberOfOperandsException {
        if(numbers==null || numbers.length<2) throw new InvalidNumberOfOperandsException("Enter atleast two numbers");
        double multiplicationResult=1;
        for (double number : numbers) {
            multiplicationResult=multiplicationResult*number;

        }
        if(multiplicationResult==-0.0) multiplicationResult=0.0;
        return multiplicationResult;
    }
}
