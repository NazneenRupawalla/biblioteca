package com.twu29.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private double finalResult=0.0;

    public void add(double... numbers) {
       Addition addition=new Addition();
       finalResult=addition.computeResult(finalResult,addition.computeResult(numbers));

    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) {
        Subtraction subtraction=new Subtraction();
        List<Double> numberList=new ArrayList<Double>();
        int count=1;
        for(double number:numbers)
        {
             numberList.add(number);
        }
        finalResult=subtraction.computeResult(finalResult,numberList.get(0));
        System.out.println("finalResult--"+finalResult);
        while(count!=numberList.size())
        {
            //System.out.println("count--"+numberList.get(count++));
            finalResult=subtraction.computeResult(finalResult,numberList.get(count++));
        }


    }


}
