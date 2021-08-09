import java.util.Scanner;
package com.startjava.lesson_2_3.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Нчать вычисления [yes/no]:");
        String repeat = scanner.next();

        while(repeat.equals("yes")) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число ");
            int num2 = scanner.nextInt();
            calc.calculate(num1, operation, num2);
            do
            {    
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = scanner.next(); 
            }    
            while (!repeat.equals("yes") && !repeat.equals("no"));     
        } System.out.println("Вычисления окончены"); 
    }            
}
 
       
