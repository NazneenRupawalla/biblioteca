package com.twu29.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subtraction implements IOperation{

    @Override
    public double computeResult(double...numbers) {

        return numbers[0]-numbers[1];
    }

}
