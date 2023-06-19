package chapter5.B;

import java.util.Scanner;

/*
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan. and 15% tax on
 * the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */
public class PhoneBillCalculator {
    // Initialize the know
    static double chargeForMinutesOver = 0.25;
    static double subTotalTax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Ask the user for his plan details
        double planMinutes = getPlanMinutes();
        double planFee = getPlanFee();

        // Ask how many minutes he spent
        double minutesUse = getUserMinutesUsage();

        // Calculate recharge for minutes if applies
        double minutesRecharge = minutesOverRecharge(planMinutes, minutesUse, chargeForMinutesOver);

        // Add the tax to the subtotal
        double total = totalAmount(planFee, minutesRecharge, subTotalTax);

        // Print the itemized bill
        billDetail(planMinutes, planFee, minutesUse, minutesRecharge, chargeForMinutesOver, subTotalTax, total);

    }

    public static double getPlanMinutes() {
        System.out.println("How many minutes does your plan have?");

        return scanner.nextDouble();
    }
    public static double getPlanFee() {
        System.out.println("How much does your plan costs?");

        return scanner.nextDouble();
    }
    public static double getUserMinutesUsage() {
        System.out.println("How many minutes did you use this month?");

        return scanner.nextDouble();
    }
    public static double minutesOverRecharge(double planMinutes, double minutesUse, double chargeForMinutesOver) {
        if (minutesUse - planMinutes < 0) {
            return 0;
        } else {
        return (minutesUse - planMinutes) * chargeForMinutesOver;
        }
    }
    public static double totalAmount(double planFee, double minutesRecharge, double subTotalTax) {

        return planFee + minutesRecharge + (subTotalTax * (planFee + minutesRecharge));
    }
    public static void billDetail(double planMinutes, double planFee, double minutesUse, double minutesRecharge,
                                  double chargeForMinutesOver, double subTotalTax, double total) {
        System.out.println("\n" +
                "******************************************************" + "\n" +
                "Your bill detail:" + "\n"
        + "Plan fee: " + planFee + "\n" +
                "Minutes include in plan: " + planMinutes + "\n" +
                "Minutes use in the month: " + minutesUse + "\n" +
                "Recharge fee for overuse: " + chargeForMinutesOver);

        if (minutesUse - planMinutes < 0) {
            System.out.println((planMinutes - minutesUse) + " minutes left in your plan" + "\n" +
                    "Minutes overcharge: $" + minutesRecharge);
        } else {
            System.out.println("You use " + (minutesUse - planMinutes) + " minutes over your plan" + "\n" +
                    "Minutes overcharge: $" + minutesRecharge);
        }

        System.out.println("Subtotal (Plan fee + Minutes overcharge): $" + (planFee + minutesRecharge) + "\n" +
                "Tax: " + (subTotalTax * 100) + "%" + "\n" +
                "Total: $" + total + "\n" +
                "******************************************************");
    }

}
