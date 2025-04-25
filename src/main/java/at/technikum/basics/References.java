package at.technikum.basics;

public class References {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        change(numbers);

        //System.out.println(numbers[0]);

        int number = 10;
        number = changeInt(number);
        System.out.println(number);
    }

    private static void change(int[] values) {
        values = new int[10];

        values[0] = 10;
    }

    private static int changeInt(int n) {
        n = 6;

        return n;
    }
}
