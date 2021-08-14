package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int num1 = Integer.parseInt(splitExpression[0]);
        int num2 = Integer.parseInt(splitExpression[2]);

        switch(splitExpression[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Операция некорректна, повторите ввод");
        } return 0;
    }
}