package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int attempts=1;
    int secretNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        do {
            if (moveOfPlayer(player1)) {
                break;
            }

            if (moveOfPlayer(player2)) {
                break;
            }

            attempts++;
        } while (attempts <= 10);
        copyOfNumbers(player1);
        copyOfNumbers(player2);
        player1.reset(attempts);
        player2.reset(attempts);
    }

    private boolean moveOfPlayer(Player player) {
        if (attempts > 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return false;
        }
        inputNumber(player);
        return compareOfNumber(player);
    }

    private void copyOfNumbers(Player player) {
        System.out.print(player.getName() + " ");
        for (int number : player.getCopyEnteredNumbers(attempts)) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    private boolean compareOfNumber(Player player) {
        if (player.getEnteredNumber(attempts) == secretNumber) {
            System.out.println("Победил " + player2.getName() + " с " + attempts + " попытки" + " Это было число - " + secretNumber);
            return true;
        } else if (player.getEnteredNumber(attempts) < secretNumber) {
            System.out.println("Число " + player2.getName() + " меньше числа компьютера");
            return false;
        } else if (player.getEnteredNumber(attempts) > secretNumber) {
            System.out.println("Число " + player2.getName() + " больше числа компьютера");
        } return false;
    }

    private void inputNumber(Player player) {
        System.out.println("игрок " + player.getName() + " введите число : ");
        int number = scan.nextInt();
        player.setEnteredNumber(attempts, number);
    }
}