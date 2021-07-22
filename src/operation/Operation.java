package operation;

import enuns.OperationType;

public class Operation {
    
    private double num1;
    private double num2;
    private double result;
    private OperationType operationType;
    

    public Operation(double num1, double num2, double result, OperationType operationType) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operationType = operationType;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
    
    
}
