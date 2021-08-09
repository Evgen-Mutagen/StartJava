package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    } 

    public void start() {
        Scanner scan = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 101);

        do {
            System.out.println("игрок " + player1.getName() + " введите число : ");
            int number1 = scan.nextInt();
            if(number1 == secretNumber) {
                System.out.println("Победил " + player1.getName() + " Это было число - " + secretNumber);
                break;
            } else if(number1 < secretNumber) {
                System.out.println("Число " + player1.getName() + " меньше числа компьютера");
            } else if(number1 > secretNumber) {
                System.out.println("Число " + player1.getName() + " больше числа компьютера");    
            }

            System.out.println("игрок " + player2.getName() + " введите число : ");
            int number2 = scan.nextInt();
             if(number2 == secretNumber) {
                System.out.println("Победил " + player2.getName() + " Это было число - " + secretNumber);
                break;
            } else if (number2 < secretNumber) {
                System.out.println("Число " + player2.getName()+ " меньше числа компьютера");
            } else if (number2 > secretNumber) {
                System.out.println("Число " + player2.getName() + " больше числа компьютера");
            }            
        } while (true);
    }
}