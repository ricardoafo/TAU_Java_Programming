package chapter3.D;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        // Get the test score
            // Open the Scanner for the user input
        Scanner input = new Scanner(System.in);
            // Ask the user for an input
        System.out.println("Enter your test score:");
            // Store the user input in a variable
        double score = input.nextDouble();
            // Close the scanner
        input.close();

        // Determine the letter grade
            // Initialize a variable for the grade
        char grade;
            // Evaluate to which grade the score belongs
        if(score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        // Output
        System.out.println("Your grade is " + grade);
    }
}
