package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String splitExpression) {
        String[] words = splitExpression.split(" ");
        int num1 = Integer.parseInt(words[0]);
        int num2 = Integer.parseInt(words[2]);
        int result =0;

        switch(words[1]) {
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
                return  (int) Math.pow(num1, num2);
            default:
                System.out.println("Операция некорректна, повторите ввод");
        } return result;
    }
}


