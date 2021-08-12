package com.startjava.lesson_2_3_4.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ввведите имя превого игрока: ");
        String name1 = scan.nextLine();
        Player player1 = new Player(name1);
        
        System.out.print("Ввведите имя второго игрока: ");
        String name2 = scan.nextLine();
        Player player2 = new Player(name2);
       
        GuessNumber game = new GuessNumber(player1, player2);

        String repeat;
        do {
            game.start();
            do {    
                System.out.println("Хотите продолжить игру? [yes/no]:");
                repeat = scan.next(); 
            } while (!repeat.equals("yes") && !repeat.equals("no")); 
        } while(repeat.equals("yes"));
        System.out.println("Вычисления окончены");   
    }
}
