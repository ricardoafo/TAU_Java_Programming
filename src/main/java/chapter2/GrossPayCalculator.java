package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the employee pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate
        double grossPay = hours * rate;

        // Display rate
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
