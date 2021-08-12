package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
   
    public void calculate(int num1, char operation, int num2) {    
        switch(operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            case '^':
                int result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                } System.out.println(result); 
                break;
            default:
                System.out.println("Операция некорректна, повторите ввод");
        }
    }    
}