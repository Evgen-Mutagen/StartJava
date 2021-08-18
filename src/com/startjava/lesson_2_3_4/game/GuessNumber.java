package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 101);
        for (i = 0; i < 10; i++) {
            System.out.println("игрок " + player1.getName() + " введите число : ");
            player1.numbersOfPlayer1[i] = scan.nextInt();
            if (player1.numbersOfPlayer1[i] == secretNumber) {
                System.out.println("Победил " + player1.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                i++;
                break;
            } else if (player1.numbersOfPlayer1[i]  < secretNumber) {
                System.out.println("Число " + player1.getName() + " меньше числа компьютера");
            } else if (player1.numbersOfPlayer1[i]  > secretNumber) {
                System.out.println("Число " + player1.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.println("игрок " + player2.getName() + " введите число : ");
            player2.numbersOfPlayer2[i]  = scan.nextInt();
            if (player2.numbersOfPlayer2[i]  == secretNumber) {
                System.out.println("Победил " + player2.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                i++;
                break;
            } else if (player2.numbersOfPlayer2[i] < secretNumber) {
                System.out.println("Число " + player2.getName() + " меньше числа компьютера");
            } else if (player2.numbersOfPlayer2[i] > secretNumber) {
                System.out.println("Число " + player2.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
        }
        copyOfNumbers();
        reset();
    }

    public void copyOfNumbers() {
        System.out.print("Числа игрока " + player1.getName() + ": ");
        int[] number1Copy = Arrays.copyOf(player1.numbersOfPlayer1, i);
        for (int k : number1Copy) {
            System.out.print(k + " ");
        } System.out.println(" ");

        System.out.print("Числа игрока " + player2.getName() + ": ");
        int[] number2Copy = Arrays.copyOf(player2.numbersOfPlayer2, i);
        for (int k : number2Copy) {
            System.out.print(k + " ");
        } System.out.println(" ");
    }
    public void reset() {
        Arrays.fill(player1.numbersOfPlayer1,0, i+1,0 );
        Arrays.fill(player2.numbersOfPlayer2,0, i+1,0);
    }
}
