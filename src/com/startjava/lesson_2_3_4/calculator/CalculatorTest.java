package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Нчать вычисления [yes/no]:");
        String repeat = scanner.nextLine();

        while(repeat.equals("yes")) {
            System.out.print("Введите математическое выражение через пробел: ");
            String[] words = scanner.nextLine().split("\\s+");
            int num1 = Integer.parseInt(words[0]);
            int num2 = Integer.parseInt(words[2]);

            calc.calculate(num1, words, num2);
            calc.print();
            do
            {    
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                repeat = scanner.next(); 
            }    
            while (!repeat.equals("yes") && !repeat.equals("no"));     
        } System.out.println("Вычисления окончены"); 
    }            
}
 
       
