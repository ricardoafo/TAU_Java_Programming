package chapter3.F;

/*
 * You're going to make a game — the objective of the game is to enter
 * enough change to equal exactly one dollar.
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {
        // Initialize variables
        double pennies = 0.01;
        double nickels = 0.05;
        double dimes = 0.10;
        double quarters = 0.25;
        int dollar = 1;

        // Ask the user for input
        // Initialize a Scanner for the input
        Scanner input = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int penniesAmount = input.nextInt();
        System.out.println("How many nickels would you like?");
        int nickelsAmount = input.nextInt();
        System.out.println("How many dimes?");
        int dimesAmount = input.nextInt();
        System.out.println("How many quarters?");
        int quartersAmount = input.nextInt();

        // Sum the total amount

        double totalAmount = (penniesAmount * pennies) +
                        (nickelsAmount * nickels) +
                        (dimesAmount * dimes) +
                        (quartersAmount * quarters);

        // Evaluate result
        if (totalAmount > dollar) {
            System.out.println("Your are asking for more than a dollar, you are $" + (totalAmount - dollar) + " over");
        } else if (totalAmount < dollar) {
            System.out.println("You are asking for less than a dollar, you are $" + (dollar - totalAmount) + " short");
        } else {
            System.out.println("Congrats! You win it is exactly a dollar");
        }
    }
}
