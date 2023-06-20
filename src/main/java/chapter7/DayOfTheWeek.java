package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday"};
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = getDayNumber();
        showStringDay(number);

        scanner.close();
    }

    public static int getDayNumber() {
        System.out.println("Enter a number for a day in the week:");
        int dayNumber;
        do {
            dayNumber = scanner.nextInt();
            if (dayNumber > 7 || dayNumber < 1) {
                System.out.println("Invalid input. Try again:");
            }
        } while (dayNumber > 7 || dayNumber < 1);

        return dayNumber;
    }
    public static void showStringDay(int number) {
        System.out.println(daysArray[number - 1]);
    }
}
