package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String repeat;

        do {
            System.out.print("Введите математическое выражение через пробел: ");
            String[] words = scanner.nextLine().split("\\s+");
            calc.calculate(words);
            System.out.println(calc.calculate(words));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = scanner.next();
            } while (!repeat.equals("yes") && !repeat.equals("no"));
        } while(repeat.equals("yes"));
        System.out.println("Вычисления окончены");
    }
}
 
       
