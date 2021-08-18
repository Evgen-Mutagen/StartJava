package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int i;
    int number1;
    int number2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 101);
        for (i = 0; i < 10; i++) {
            System.out.println("игрок " + player1.getName() + " введите число : ");
            number1 = scan.nextInt();
            if (number1 == secretNumber) {
                System.out.println("Победил " + player1.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                break;
            } else if (number1 < secretNumber) {
                System.out.println("Число " + player1.getName() + " меньше числа компьютера");
            } else if (number1 > secretNumber) {
                System.out.println("Число " + player1.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.println("игрок " + player2.getName() + " введите число : ");
            number2 = scan.nextInt();
            if (number2 == secretNumber) {
                System.out.println("Победил " + player2.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                break;
            } else if (number2 < secretNumber) {
                System.out.println("Число " + player2.getName() + " меньше числа компьютера");
            } else if (number2 > secretNumber) {
                System.out.println("Число " + player2.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
        }
    }

    public void copyOfNumber1() {
        System.out.print("Числа игрока " + player1.getName() + ": ");
        int[] number1Copy = Arrays.copyOf(array1.getNumber(), i);
        for (int k : number1Copy) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }

    public void copyOfNumber2() {
        System.out.print("Числа игрока " + player2.getName() + ": ");
        int [] number2Copy = Arrays.copyOf(array2.getNumber(), i);
        for (int k : number2Copy) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }

    public void reset() {
        Arrays.fill(number1,0, i+1,0 );
        Arrays.fill(number2,0, i+1,0);
    }
}