package com.startjava.lesson_1.statement;

public class ConditionalStatement {
   
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("Дед");
        } 

        boolean man = true;
        if (man) { 
            System.out.println("Мужчина");
        }
        if (!man) { 
            System.out.println("Женщина");
        }

        double height = 1.85;
        if (height < 1.80 ) { 
            System.out.println("Нормальный");
        } else { 
            System.out.println("Высокий");
        }

        char firstLetterName  = 'E';
        if (firstLetterName == 'I') {
            System.out.println("Ибрагим");
        } else if (firstLetterName == 'M') {
            System.out.println("Мафусаил");
        } else {
            System.out.println("Евгений");
        }
    }
}   