package com.twu29.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private double finalResult=0.0;
    private Boolean operationPerformed=Boolean.FALSE;

    public void add(double... numbers) {
        IOperation addition=new Addition();
        setArithmeticOperationPerformed();
        finalResult=addition.computeResult(finalResult,addition.computeResult(numbers));
    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) {

        IOperation subtraction=new Subtraction();
        int indexOfArray=0;
        indexOfArray=performComputationIfConditionIsMet(subtraction,indexOfArray,numbers);
        performOperationToComputeFinalResult(subtraction, indexOfArray, numbers);
        setArithmeticOperationPerformed();

    }


    public void multiply(double...numbers) {
        IOperation multiplication=new Multiplication();
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            finalResult=1;
        finalResult=multiplication.computeResult(finalResult,multiplication.computeResult(numbers));
        setArithmeticOperationPerformed();
    }

    public void divide(double...numbers) {
        IOperation division=new Division();
        int indexOfArray=0;
        indexOfArray=performComputationIfConditionIsMet(division,indexOfArray,numbers);
        performOperationToComputeFinalResult(division, indexOfArray, numbers);
        setArithmeticOperationPerformed();
    }


    private void setArithmeticOperationPerformed() {
        operationPerformed=Boolean.TRUE;
    }

    private Boolean checkIfAnyOtherArithmeticOperationsWerePerformedBefore() {
        return operationPerformed;
    }

    private void performOperationToComputeFinalResult(IOperation operation, int indexOfArray, double[] numbers) {
        while(indexOfArray!=numbers.length){
            finalResult=operation.computeResult(finalResult,numbers[indexOfArray++]);
        }
    }

    private int performComputationIfConditionIsMet(IOperation operation, int indexOfArray, double[] numbers) {
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            finalResult=operation.computeResult(numbers[indexOfArray++],numbers[indexOfArray++]);
        return indexOfArray;

    }


}
