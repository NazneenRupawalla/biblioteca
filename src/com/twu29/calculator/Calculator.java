package com.twu29.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private double finalResult=0.0;
    private Boolean operationPerformed=Boolean.FALSE;


    public void add(double... numbers) {
       Addition addition=new Addition();
        setArithmeticOperationPerformed();
        finalResult=addition.computeResult(finalResult,addition.computeResult(numbers));
    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) {

        Subtraction subtraction=new Subtraction();
        int indexOfArray=0;
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
           finalResult=subtraction.computeResult(numbers[indexOfArray++],numbers[indexOfArray++]);
        while(indexOfArray!=numbers.length){
           finalResult=subtraction.computeResult(finalResult,numbers[indexOfArray++]);
        }
        setArithmeticOperationPerformed();

    }

    private void setArithmeticOperationPerformed() {
        operationPerformed=Boolean.TRUE;
    }

    private Boolean checkIfAnyOtherArithmeticOperationsWerePerformedBefore() {
        return operationPerformed;
    }

    public void multiply(double...numbers) {
        Multiplication multiplication=new Multiplication();
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            finalResult=1;
        finalResult=multiplication.computeResult(finalResult,multiplication.computeResult(numbers));
        setArithmeticOperationPerformed();
    }

    public void divide(double...numbers) {
        Division division=new Division();
        int count=0;
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            finalResult=division.computeResult(numbers[count++],1);

        while(count!=numbers.length)
            finalResult=division.computeResult(finalResult,numbers[count++]);
        setArithmeticOperationPerformed();
    }

}
