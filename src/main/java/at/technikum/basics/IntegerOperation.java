package at.technikum.basics;

public class IntegerOperation {

    public static void main(String[] args) {

        // "Test" + "Hallo" = "TestHallo"
        // 4 + 5 = 9
        /*
        System.out.printf("%d + %d = %d\n", 5, 4, 5 + 4);
        System.out.printf("%d - %d = %d\n", 5, 9, 5 - 9);
        System.out.printf("%d * %d = %d\n", 5, 4, 5 * 4);
        System.out.printf("%d / %d = %d", 5, 4, 5 / 4);
         */

        /*
        System.out.printf("%d\n", Integer.MAX_VALUE);
        System.out.printf("%d\n", Integer.MIN_VALUE);
        System.out.printf("%d", Integer.MAX_VALUE + 1); // = Integer.MIN_VALUE
         */

        /*
        System.out.println("Hello");

        System.out.printf("%d / %d = %d", 5, 0, 5 / 0);

        System.out.println("World");
        */

        System.out.printf(
                "%d / %d = %d Rest: %d",
                24, 5, 24 / 5, 24 % 5
        );
    }
}
