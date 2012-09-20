package com.twu29.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subtraction {

    public double computeResult(double firstNumber,double secondNumber) {
        if(firstNumber==0)
        {
            return secondNumber-firstNumber;
        }
        return firstNumber-secondNumber;
    }
}
