package com.pack.task3;

import java.util.Scanner;

/**
 * Created by Szymon Foltyn on 2017-05-16.
 */
public class DoubleDiceGameSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        System.out.println("----------  DOUBLE DICE GAME SIMULATOR  ----------");
        System.out.println();
        System.out.println("Simply rules: Won player who won less point");

        String click;
            System.out.println("Press 'Y' and ENTER to play");
            System.out.println("Press 'N' and ENTER to close program");
            click = sc.next();
            if (click.equalsIgnoreCase("Y")) {
                game.play();
            } else {System.exit(0);}
    }
}

