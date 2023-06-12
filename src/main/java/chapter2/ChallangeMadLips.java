package chapter2;

import java.util.Scanner;

/*
 Create a program that ask the user for a season of the year, then a whole number, then an adjective.
 Use the input to complete the sentence below then output the result:
 "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee"
 */
public class ChallangeMadLips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for season of the year
        System.out.println("Enter a season of the year");
        String season = scanner.next();

        // Ask the user for a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        // Ask the user for a weather adjective
        System.out.println("Enter a weather adjective");
        String adjective = scanner.next();
        scanner.close();

        // Complete the sentence
        // "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee"
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");


    }
}
