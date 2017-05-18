package com.pack.task3;

import java.util.Random;

/**
 * Created by Szymon Foltyn on 2017-05-16.
 */
public class Dice {

    private int value;
    private final static int SIDES_NO = 6;

    public void rollDice() {

        Random random = new Random();
        value = random.nextInt(SIDES_NO) + 1;

        if (value == 1) show1();
        else if (value == 2) show2();
        else if (value == 3) show3();
        else if (value == 4) show4();
        else if (value == 5) show5();
        else if (value == 6) show6();
    }

    public void show1() {
        System.out.println(" ----------");
        System.out.println(" |        |");
        System.out.println(" |    O   |");
        System.out.println(" |        |");
        System.out.println(" ----------");
    }

    public void show2() {
        System.out.println(" ----------");
        System.out.println(" |  O     |");
        System.out.println(" |        |");
        System.out.println(" |      O |");
        System.out.println(" ----------");
    }

    public void show3() {
        System.out.println(" ----------");
        System.out.println(" |  O     |");
        System.out.println(" |    O   |");
        System.out.println(" |      O |");
        System.out.println(" ----------");
    }

    public void show4() {
        System.out.println(" ----------");
        System.out.println(" | O    O |");
        System.out.println(" |        |");
        System.out.println(" | O    O |");
        System.out.println(" ----------");
    }

    public void show5() {
        System.out.println(" ----------");
        System.out.println(" | O    O |");
        System.out.println(" |    O   |");
        System.out.println(" | O    O |");
        System.out.println(" ----------");
    }

    public void show6() {
        System.out.println(" ----------");
        System.out.println(" | O    O |");
        System.out.println(" | O    O |");
        System.out.println(" | O    O |");
        System.out.println(" ----------");
    }

    public int getValue() {
        return value;
    }
}
