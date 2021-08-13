package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    int result;

    public void calculate(int num1, String[] words, int num2) {

        switch(words[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Операция некорректна, повторите ввод");
        }
    }

    public void print() {

        System.out.println(result);
    }
}