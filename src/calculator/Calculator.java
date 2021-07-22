package calculator;

public class Calculator {
    
    
    public double sum(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtraction (double num1, double num2) {
        return num1 - num2;
    }
   
    public double multiplication (double num1, double num2) {
        return num1 * num2;
    }
    
    public double division (double num1, double num2) {
        return num1 / num2;
    }
    
    public double root (double num1, double num2) {
        return Math.round(Math.pow(num1, 1.0 / num2));
    }
}
