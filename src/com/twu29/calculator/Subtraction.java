package com.twu29.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subtraction {

    public double computeResult(double...numbers) {
        if(numbers[0]==0)
        {
            return numbers[1]-numbers[0];
        }
        return numbers[0]-numbers[1];
    }
}
