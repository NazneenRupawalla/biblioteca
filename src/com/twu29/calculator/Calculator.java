package com.twu29.calculator;

public class Calculator {

    private double finalResult=0.0;
    private Boolean operationPerformed=Boolean.FALSE;

    public void add(double... numbers) throws InvalidNumberOfOperandsException {
        IOperation addition=new Addition();
            finalResult=addition.computeResult(finalResult,addition.computeResult(numbers));
            setArithmeticOperationPerformed();


    }


    public double getFinalResult() {
        return finalResult;
    }

    public void subtract(double...numbers) throws InvalidNumberOfOperandsException {

        IOperation subtraction=new Subtraction();
        performComputation(subtraction, numbers);
        //includePreviousResultToTheOriginalArrayOfNumbersForFurtherComputation(subtraction,numbers);
        //setArithmeticOperationPerformed();

    }


    public void multiply(double...numbers) throws InvalidNumberOfOperandsException {
        IOperation multiplication=new Multiplication();
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            finalResult=1;
       // try{
            finalResult=multiplication.computeResult(finalResult,multiplication.computeResult(numbers));
            setArithmeticOperationPerformed();

        //}catch(InvalidNumberOfOperandsException invalidNumberOfOperandsException)
        //{
        //    System.out.println("Enter atleast two numbers");
        //}
      //  setArithmeticOperationPerformed();
    }

    public void divide(double...numbers) throws InvalidNumberOfOperandsException {
        IOperation division=new Division();
        performComputation(division, numbers);
        //includePreviousResultToTheOriginalArrayOfNumbersForFurtherComputation(division,numbers);
        setArithmeticOperationPerformed();
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
        //int indexOfOriginalArray=0;
        numbersFinalArray[indexOfFinalArray++]=finalResult;
        for (double number : numbers) {
                numbersFinalArray[indexOfFinalArray++]=number;
        }

        performOperationOnNumbers(operation, numbersFinalArray);

    }

    private void performOperationOnNumbers(IOperation operation, double[] numbers) throws InvalidNumberOfOperandsException {
       // try
       // {
            finalResult=operation.computeResult(numbers);
            setArithmeticOperationPerformed();

       // }catch(InvalidNumberOfOperandsException invalidNumberOfOperandsException)
       // {
       //     System.out.println("Enter atleast two numbers");
       // }
    }

    private void performComputation(IOperation operation, double[] numbers) throws InvalidNumberOfOperandsException {
        if(!checkIfAnyOtherArithmeticOperationsWerePerformedBefore())
            performOperationOnNumbers(operation, numbers);
        else
            includePreviousResultToTheOriginalArrayOfNumbersForFurtherComputation(operation, numbers);


    }


}
