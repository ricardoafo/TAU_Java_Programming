package chapter3.C;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {
        // Initialize Scanner to get input
        Scanner input = new Scanner(System.in);

        // Evaluate the prospect

        // Ask how much the prospect makes a year
        System.out.println("How much do you make a year?");
        double salary = input.nextDouble();

        if (salary >= 30000) {
            // Ask for how long the prospect has been in his job
            System.out.println("For how long have you been in your current job?. Answers in with an amount of months " +
                    "(for example: 16)");
            int timeInCurrentJob = input.nextInt();

            // Nested if, second evaluation of the prospect
            if (timeInCurrentJob >= 24) {
                System.out.println("Congrats! you are eligible for a loan");
            } else {
                System.out.println("You need to have been working for at least 2 years in your current job to" +
                        " apply for a loan");
            }
        } else {
            System.out.println("You need to make at least $30,000 a year to apply for a loan");
        }
        // CLose the scanner
        input.close();
    }
}
