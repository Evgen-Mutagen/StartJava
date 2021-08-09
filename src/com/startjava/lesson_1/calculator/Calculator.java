package com.startjava.lesson_1.calculator;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        char operation = '^';
        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        } else if (operation == '^') {
             int result = num1;
             for (int i = 1; i < num2; i++) {
                 result *= num1;
             } System.out.println(result);    
        } else {
            System.out.println("Операция некорректна, повторите ввод");
        }      
    }
}