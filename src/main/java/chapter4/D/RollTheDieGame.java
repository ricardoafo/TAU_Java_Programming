package chapter4.D;

/*
 The objective of the game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 - 6) and advance the user that number of spaces on the
 game board.
 * After each roll, tell the user which game space they are on and how many more spaces they have to go win.
 * Repeat this additional times for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they've won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message like "You advanced to space 22 is a bug."
 */

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {

    public static void main(String[] args) {

        // Initialize known variables
        int gameBoardSpaces = 20;
        int rollTimes = 1;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int currentSpace = 0;
        int currentDie = 1;

        // Start trowing the die
        System.out.println("Welcome to the game! Would you like to star (Y/N)");
        String startTheGame = input.next().toUpperCase();

        if (startTheGame.equals("Y")) {
            System.out.println("Great! Let's start");
        } else if (startTheGame.equals("N")) {
            System.out.println("Ok, maybe next time");
            System.exit(0);
        }

        input.close();

            do {

                int die = random.nextInt(6) + 1;
                System.out.println("Rolling die " + currentDie);
                System.out.println("You got the number: " + die);

                currentSpace += die;


                if (currentSpace < gameBoardSpaces) {
                    System.out.println("You advance to space: " + currentSpace);
                } else if (currentSpace > gameBoardSpaces) {
                    System.out.println("You loose! you got out of the game board by " + (currentSpace - gameBoardSpaces) +
                            " spaces");
                    break;
                } else {
                    System.out.println("You won! You are in the space " + currentSpace + ". Congrats!!");
                    break;
                }

                rollTimes++;
                currentDie++;

                if (rollTimes == 5) {
                    System.out.println("You loose, die's where roll and you where short for " +
                            (gameBoardSpaces - currentSpace) + " spaces");
                }
            } while (rollTimes <= 4);
    }
}
