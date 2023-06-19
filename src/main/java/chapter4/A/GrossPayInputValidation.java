package chapter4.A;

import java.util.Scanner;

/*
 Each store employee makes $15 an hour. Write a program that allows a manager to enter the number
 of weekly hours worked for each employee, and calculate their pay. Do not allow for overtime.
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {

        // Initialize know variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();

        // Validate input
        int tryCount = 1;
        while (hoursWorked > maxHours || hoursWorked < 1) {
            if (tryCount < 3) {
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again.");
            hoursWorked = input.nextDouble();
            tryCount++;
            } else {
                System.out.println("You enter too many invalid entries. Program close.");
                break;
            }
        }
        input.close();

        // Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
