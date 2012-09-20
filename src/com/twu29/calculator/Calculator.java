package com.twu29.calculator;

import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private double finalResult=0.0;
    private Boolean operationPerformed=Boolean.FALSE;

    public void add(double... numbers) {
       Addition addition=new Addition();
       operationPerformed= Boolean.TRUE;
       finalResult=addition.computeResult(finalResult,addition.computeResult(numbers));

    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) {
        Subtraction subtraction=new Subtraction();
        operationPerformed=Boolean.TRUE;
        List<Double> numberList=new ArrayList<Double>();
        int count=1;
        for(double number:numbers)
        {
             numberList.add(number);
        }
        finalResult=subtraction.computeResult(finalResult,numberList.get(0));
        while(count!=numberList.size())
        {

            finalResult=subtraction.computeResult(finalResult,numberList.get(count++));
        }


    }


    public void multiply(double...numbers) {
        Multiplication multiplication=new Multiplication();
        if(finalResult==0.0 && !operationPerformed)
            finalResult=1;
        finalResult=multiplication.computeResult(finalResult,multiplication.computeResult(numbers));
    }

    public void divide(double...numbers) {
        Division division=new Division();
        int count=0;
        if(finalResult==0.0 && !operationPerformed)
            finalResult=division.computeResult(numbers[count++],1);

        while(count!=numbers.length)
        finalResult=division.computeResult(finalResult,numbers[count++]);
    }

}
