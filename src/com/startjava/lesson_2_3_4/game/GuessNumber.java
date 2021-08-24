package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int attempts = 1;
    int secretNumber;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = (int) (Math.random() * 101);
        do {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
            attempts++;
        } while (true);
        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
        player1.reset(attempts);
        player2.reset(attempts);
    }

    private boolean makeMove(Player player) {
        if (attempts == 11) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        inputNumber(player);
        return compareOfNumber(player);
    }

    private void inputNumber(Player player) {
        System.out.println("игрок " + player.getName() + " введите число : ");
        int number = scan.nextInt();
        player.setEnteredNumber(attempts, number);
    }

    private boolean compareOfNumber(Player player) {
        String moreLess = player.getEnteredNumber(attempts) < secretNumber ? " меньше " : " больше ";
        if (player.getEnteredNumber(attempts) == secretNumber) {
            System.out.println("Победил " + player.getName() + " с " + attempts +
                    " попытки" + " Это было число - " + secretNumber);
            return true;
        }
        System.out.println("Число " + player.getName() + moreLess + "числа компьютера");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.print(player.getName() + " ");
        for (int number : player.getCopyEnteredNumbers(attempts)) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}