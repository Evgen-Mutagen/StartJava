package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int i;
    private int[] number1 = new int[10];
    private int[] number2 = new int[10];

    Player array = new Player(number1, number2);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 101);;

        for (i = 0; i < 10; i++) {
            System.out.println("игрок " + player1.getName() + " введите число : ");
            number1[i] = scan.nextInt();
            if (number1[i] == secretNumber) {
                System.out.println("Победил " + player1.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                i++;
                break;
            } else if (number1[i] < secretNumber) {
                System.out.println("Число " + player1.getName() + " меньше числа компьютера");
            } else if (number1[i] > secretNumber) {
                System.out.println("Число " + player1.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.println("игрок " + player2.getName() + " введите число : ");
            number2[i] = scan.nextInt();
            if (number2[i] == secretNumber) {
                System.out.println("Победил " + player2.getName() + " с " + (i + 1) + " попытки" + " Это было число - " + secretNumber);
                i++;
                break;
            } else if (number2[i] < secretNumber) {
                System.out.println("Число " + player2.getName() + " меньше числа компьютера");
            } else if (number2[i] > secretNumber) {
                System.out.println("Число " + player2.getName() + " больше числа компьютера");
            }
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
        }
    }

    public void copyOfNumber1() {
        int[] number1Copy = Arrays.copyOf(array.getNumber1(), i);
        for (int j = 0; j < number1Copy.length; j++) {
            System.out.print(number1Copy[j] + " ");
        } System.out.println(" ");
    }

    public void copyOfNumber2() {
            int [] number2Copy = Arrays.copyOf(array.getNumber2(), i);
            for (int j= 0; j< number2Copy.length; j++)  {
                System.out.print(number2Copy[j] + " ");
            } System.out.println(" ");
    }

    public void reset() {
        Arrays.fill(number1,0, i+1,0 );
        Arrays.fill(number2,0, i+1,0);
    }
}