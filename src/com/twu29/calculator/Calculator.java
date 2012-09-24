package com.twu29.calculator;

public class Calculator {

    private double finalResult=0.0;
    private Boolean operationPerformed=Boolean.FALSE;

    public void add(double... numbers) throws InvalidNumberOfOperandsException {
        IOperation addition=new Addition();
        performComputation(addition,numbers);
    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) throws InvalidNumberOfOperandsException {

        IOperation subtraction=new Subtraction();
        performComputation(subtraction, numbers);

    }


    public void multiply(double...numbers) throws InvalidNumberOfOperandsException {
        IOperation multiplication=new Multiplication();
        performComputation(multiplication,numbers);
    }

    public void divide(double...numbers) throws InvalidNumberOfOperandsException {
        IOperation division=new Division();
        performComputation(division, numbers);
    }


    private void setArithmeticOperationPerformed() {
        operationPerformed=Boolean.TRUE;
    }

    private Boolean checkIfAnyOtherArithmeticOperationsWerePerformedBefore() {
        return operationPerformed;
    }

    private void includePreviousResultToTheOriginalArrayOfNumbersForFurtherComputation(IOperation operation, double[] numbers) throws InvalidNumberOfOperandsException {

        double[] numbersFinalArray=new double[numbers.length+1];
        int indexOfFinalArray=0;
        numbersFinalArray[indexOfFinalArray++]=finalResult;
        for (double number : numbers) {
                numbersFinalArray[indexOfFinalArray++]=number;
        }

        performOperationOnNumbers(operation, numbersFinalArray);

    }

    private void performOperationOnNumbers(IOperation operation, double[] numbers) throws InvalidNumberOfOperandsException {
            finalResult=operation.computeResult(numbers);
            setArithmeticOperationPerformed();

    }

    private void performComputation(IOperation operation, double[] numbers) throws InvalidNumberOfOperandsException {
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            performOperationOnNumbers(operation, numbers);
        else
            includePreviousResultToTheOriginalArrayOfNumbersForFurtherComputation(operation, numbers);


    }


}
