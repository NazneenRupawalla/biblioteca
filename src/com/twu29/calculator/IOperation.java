package com.twu29.calculator;

public interface IOperation {
    public double computeResult(double... numbers) throws InvalidNumberOfOperandsException;
}
