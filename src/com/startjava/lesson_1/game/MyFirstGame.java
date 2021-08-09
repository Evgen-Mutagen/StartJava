package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 35;
        int playerNumber = 0;
        for (int i = 0; i <= 100; i++) {
            if (playerNumber > computerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber --;
            } else if (playerNumber < computerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber += 8;
            } else {
                break;
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}