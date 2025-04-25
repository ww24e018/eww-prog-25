package at.technikum.basics;

import java.util.Scanner;

public class InputLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Number :");
        int n = scanner.nextInt();

        while (n > 0) {
            System.out.print("Number :");
            n = scanner.nextInt();
        }
        */

        /*
        int n = 1;

        while (n > 0) {
            System.out.print("Number :");
            n = scanner.nextInt();
        }
        */

        /*
        while (true) {
            System.out.print("Number: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                break;
            }
        }
        */

        int n;
        int count = 0;
        int sum = 0;
        int max = 0;
        do {
            System.out.print("Number: ");
            n = scanner.nextInt();

            if (n > 0) {
                count++;
                sum += n;

                if (n > max) {
                    max = n;
                }
            }
        } while (n > 0);

        System.out.printf("Count: %d\n", count);
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Max: %d\n", max);
        System.out.println("End.");

        scanner.close();
    }
}
