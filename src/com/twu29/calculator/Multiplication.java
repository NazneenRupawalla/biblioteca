package com.twu29.calculator;

public class Multiplication implements IOperation{


    @Override
    public double computeResult(double... numbers) {
        double multiplicationResult=1;
        for (double number : numbers) {
            multiplicationResult=multiplicationResult*number;

        }
        return multiplicationResult;
    }
}
