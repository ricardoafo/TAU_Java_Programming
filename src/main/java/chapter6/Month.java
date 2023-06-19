package chapter6;

public class Month {

    public static String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month.  Month must be between 1 and 12.";
        };
    }
    public static int getMonth(String month) {
        switch (month) {
            case "January" -> { return 1; }
            case "February" -> { return 2; }
            case "March" -> { return 3; }
            case "April" -> { return 4; }
            case "May" -> { return 5; }
            case "June" -> { return 6; }
            case "July" -> { return 7; }
            case "August" -> { return 8; }
            case "September" -> { return 9; }
            case "October" -> { return 10; }
            case "November" -> { return 11; }
            case "December" -> { return 12; }
            default -> { return -1; }
        }
    }
}
