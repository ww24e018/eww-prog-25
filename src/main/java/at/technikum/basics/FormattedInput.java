package at.technikum.basics;

import java.util.Scanner;

public class FormattedInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.printf("%d + %d = %d", a, b, a + b);


        System.out.print("Enter name: ");
        String name = input.next();

        System.out.printf("Hello %s", name);
    }
}
