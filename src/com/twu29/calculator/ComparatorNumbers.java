package com.twu29.calculator;


import java.util.Comparator;

public class ComparatorNumbers implements Comparator<Double>
{

    @Override
    public int compare(Double firstNumber, Double secondNumber) {
        if(firstNumber > secondNumber)
            return -1;
        else if(firstNumber < secondNumber)
            return 1;
        else
            return 0;
    }
}
