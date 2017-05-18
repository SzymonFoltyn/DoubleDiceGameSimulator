package com.pack.task3;

/**
 * Created by Szymon Foltyn on 2017-05-17.
 */
public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Dices dices;

    // max throws no. one player in one round;
    private static final int MAX_NO_THROWS = 10;
    // no. of round for each player
    private static final int MAX_NO_ROUNDS = 10;

    public Game() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.dices = new Dices();
        this.currentPlayer = player1;
    }

    public void play() {
        int currentDice;
        int currentThrow = 1;

        while ((player2.getRound() + player1.getRound()) < MAX_NO_ROUNDS) {
            currentDice = dices.rollTwoDice();

            if (currentThrow == 1 && (currentDice == 7 || currentDice == 11)) {
                currentPlayer.updateScore(0);
                currentPlayer.updateRound();
                changePlayer();
                currentThrow = 1;

            } else if (currentThrow == 1 && (currentDice == 2 || currentDice == 12)) {
                currentPlayer.updateScore(12 * MAX_NO_THROWS);
                currentPlayer.updateRound();
                changePlayer();
                currentThrow = 1;

            } else if (currentDice == 5) {
                currentPlayer.updateScore(0);
                currentPlayer.updateRound();
                changePlayer();
                currentThrow = 1;

            } else {
                double tmpVal =  (double)currentDice / (double)currentThrow;
                if (currentThrow < MAX_NO_THROWS) {
                    currentPlayer.updateScore(tmpVal);
                    updateThrowNo(currentThrow);
                    currentThrow++;
                } else {
                    currentPlayer.updateRound();
                    updateThrowNo(currentThrow);
                    changePlayer();
                    currentThrow = 1;
                }
            }
        }
//            } while ();


        System.out.println();
        System.out.println();

        if (

                winner() != null)

        {
            System.out.println("---------------  GAME RESULTS  ---------------");
            System.out.println(winner() + " WINS!");
            System.out.println(player1.getName() + " won " + player1.getTotalScore() + " points.");
            System.out.println(player2.getName() + " won " + player2.getTotalScore() + " points.");
        } else

        {
            System.out.println("Game tie !!!");
        }

    }

    private Player winner() {
        if (player1.getTotalScore() < player2.getTotalScore()) {
            return player1;
        } else if (player1.getTotalScore() > player2.getTotalScore()) {
            return player2;
        } else {
            return null;
        }
    }

    private Player changePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        return currentPlayer;
    }

    private void updateThrowNo(int throwNo) {
        System.out.println("Throw number: " + throwNo);
    }
}
