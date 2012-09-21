package com.twu29.calculator;

public class Addition {

    public double computeResult(double... numbers) {
        double sum=0;

        for (double number : numbers) {
              sum=sum+number;

        }

    return sum;
    }

}
