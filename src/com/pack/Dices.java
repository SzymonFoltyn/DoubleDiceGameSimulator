package com.pack.task3;


/**
 * Created by Szymon Foltyn on 2017-05-17.
 */
public class Dices {
    private Dice dice1;
    private Dice dice2;
    private int value;

    public Dices() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public int rollTwoDice() {
        dice1.rollDice();
        dice2.rollDice();
        return sumValue();
    }

    private int sumValue() {
        int sum = dice1.getValue() + dice2.getValue();
        return sum;
    }
}

