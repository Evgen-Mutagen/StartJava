package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    int result;

    public String calculate(String[] words) {
        int num1 = Integer.parseInt(words[0]);
        int num2 = Integer.parseInt(words[2]);

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
        return Integer.toString(result);
    }
}


