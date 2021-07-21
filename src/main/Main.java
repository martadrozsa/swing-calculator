package main;

import calculator.Calculator;
import view.CalculatorView;

public class Main {
    
    public static void main(String[] args) {
        
// l - faça uma calculadora com uma interface utilizando o swing e que atenda os seguintes requisitos:
// A calculadora deve:
// 1 - possuir botões para os números de 0 até 9
// 2 - possuir botões para as operações de soma, subtração, divisão, multiplicação e raiz quadrada
// 3 - possuir botões para cancelar/limpar a operação em progresso
// 4 - possuir um botão de igual "=" para executar a operação em progresso
// 5 - a calculadora deve funcionar da seguinte forma: 
//    a) o usuário clica em um número; 
//    b) o usuário clica na operação; 
//    c) o usuário clica no segundo número; 
//    d) o usuário clica no botão de igual; 
//    e) a calculadora executa a operação e exibe o resultado
//        Calculator c = new Calculator();
//
//        double sum = c.sum(5, 6);
//        System.out.println("Sum = " + sum);
//
//        double subtraction = c.division(10, 2);
//        System.out.println("Subtraction = " + subtraction);
//
//        double multiplication = c.multiplication(6, 6);
//        System.out.println("Multiplication = " + multiplication);
//
//        double division = c.division(25, 5);
//        System.out.println("Division = " + division);
//        
//        double squareRoot = c.squareRoot(16);
//        System.out.println("Square Root = " + squareRoot);

        CalculatorView view = new CalculatorView(); // Cria objeto do JFrame TelaPrincipal
        view.setVisible(true); // Abre a TelaPrincipal
    }
    
    
    
}
