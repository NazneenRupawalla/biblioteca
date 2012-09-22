package com.twu29.calculator;

public class Division implements IOperation{

    @Override
    public double computeResult(double...numbers) {
        return numbers[0]/numbers[1];
    }


}
