package chapter4.C;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        // Search text for letter A
        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("This text does not contains the letter 'A'");
        }
    }
}
