package com.twu29.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subtraction implements IOperation{

    @Override
    public double computeResult(double...numbers) throws InvalidNumberOfOperandsException {
        if(numbers==null || numbers.length<2) throw new InvalidNumberOfOperandsException("Enter atleast two numbers");

        double subtractionResult=numbers[0];
        for(int indexOfArray=1;indexOfArray<=numbers.length-1;indexOfArray++)
        {
             subtractionResult=subtractionResult-numbers[indexOfArray];
        }

        return subtractionResult;
    }

}
