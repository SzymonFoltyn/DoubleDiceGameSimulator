package com.pack.task3;

/**
 * Created by Szymon Foltyn on 2017-05-16.
 */
public class Player {
    private String name;
    private double totalScore;
    private int round;

    public Player(String name) {
        this.name = name;
        this.round = 0;
        this.totalScore = 0;
    }

    public void updateScore(double currentDice) {
        double tmpV = totalScore += currentDice;
        tmpV *= 100;
        tmpV = Math.round(tmpV);
        totalScore = tmpV / 100;
        System.out.println("Total score " + name + " equals __ " + totalScore);
    }

    public void updateRound() {
        round += 1;
        System.out.println(name + " finish Round " + round);
        System.out.println("Changing player");
    }

    public double getTotalScore() {
        return totalScore;
    }

    public int getRound() {
        return round;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
