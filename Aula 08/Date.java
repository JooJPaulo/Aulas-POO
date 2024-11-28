public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor for MM/DD/YYYY format
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor for "Month DD, YYYY" format
    public Date(String monthName, int day, int year) {
        this.month = convertMonthNameToNumber(monthName);
        this.day = day;
        this.year = year;
    }

    // Constructor for "DDD YYYY" format
    public Date(int dayOfYear, int year) {
        this.year = year;
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear(year)) {
            monthDays[1] = 29;
        }
        int month = 0;
        while (dayOfYear > monthDays[month]) {
            dayOfYear -= monthDays[month];
            month++;
        }
        this.month = month + 1;
        this.day = dayOfYear;
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to convert month name to number
    private int convertMonthNameToNumber(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: throw new IllegalArgumentException("Invalid month name: " + monthName);
        }
    }

    // Method to generate output in MM/DD/YYYY format
    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Method to generate output in "Month DD, YYYY" format
    public String toMonthDDYYYY() {
        String monthName = convertNumberToMonthName(month);
        return String.format("%s %02d, %04d", monthName, day, year);
    }

    // Method to generate output in "DDD YYYY" format
    public String toDDDYYYY() {
        int dayOfYear = calculateDayOfYear();
        return String.format("%03d %04d", dayOfYear, year);
    }

    // Method to convert month number to name
    private String convertNumberToMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        return monthNames[month - 1];
    }

    // Method to calculate the day of the year
    private int calculateDayOfYear() {
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear(year)) {
            monthDays[1] = 29;
        }
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += monthDays[i];
        }
        dayOfYear += day;
        return dayOfYear;
    }

    public static void main(String[] args) {
        // Test the Date class
        Date date1 = new Date(12, 25, 2021);
        Date date2 = new Date("June", 14, 1992);
        Date date3 = new Date(165, 2021);

        System.out.println("Date 1 (MM/DD/YYYY): " + date1.toMMDDYYYY());
        System.out.println("Date 1 (Month DD, YYYY): " + date1.toMonthDDYYYY());
        System.out.println("Date 1 (DDD YYYY): " + date1.toDDDYYYY());

        System.out.println("Date 2 (MM/DD/YYYY): " + date2.toMMDDYYYY());
        System.out.println("Date 2 (Month DD, YYYY): " + date2.toMonthDDYYYY());
        System.out.println("Date 2 (DDD YYYY): " + date2.toDDDYYYY());

        System.out.println("Date 3 (MM/DD/YYYY): " + date3.toMMDDYYYY());
        System.out.println("Date 3 (Month DD, YYYY): " + date3.toMonthDDYYYY());
        System.out.println("Date 3 (DDD YYYY): " + date3.toDDDYYYY());
    }
}