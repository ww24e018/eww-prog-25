package at.technikum.basics;

import java.util.Scanner;

public class DaysOfMonth {

    final static int JAN = 1;
    final static int FEB = 2;
    final static int MAR = 3;

    public static void main(String[] args) {
        System.out.print("Month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        /*
        if (month > 0 && month <= 12) {

            if (
                    month == 1 ||
                    month == 3 ||
                    month == 5 ||
                    month == 7 ||
                    month == 8 ||
                    month == 10 ||
                    month == 12
            ) {
                System.out.println("Days: 31");
            } else if (month == 2) {
                System.out.println("Days: 28");
            } else {
                System.out.println("Days: 30");
            }
        } else {
            System.out.println("Invalid month!");
        }
        */

        /*
        // Check if month is in valid range
        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return;
        }

        // Check if month is Jan, March, ...
        if (
                month == JAN ||
                month == MAR ||
                month == 5 ||
                month == 7 ||
                month == 8 ||
                month == 10 ||
                month == 12
        ) {
            System.out.println("Days: 31");
            return;
        }

        if (month == FEB) {
            System.out.println("Days: 28");
            return;
        }

        // Rest automatically 30 days
        System.out.println("Days: 30");
        */

        switch (month) {
            case JAN, MAR, 5, 7, 8, 10, 12:
                System.out.println("Days: 31");
                break;
            case FEB:
                System.out.println("Days: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Days: 30");
                break;
            default:
                System.out.println("Invalid month!");
        }

        System.out.println("THE END!");
    }
}
