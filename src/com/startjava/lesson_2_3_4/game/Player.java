package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] number1;
    private int[] number2;

    public Player(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public Player(int[] number1, int[] number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int[] getNumber1() {
        return number1;
    }

    public int[] getNumber2() {
        return number2;
    }
}
