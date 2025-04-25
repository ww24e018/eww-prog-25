package at.technikum.basics;

public class IntArray {

    public static void main(String[] args) {

        int[] numbers1 = new int[10];

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = 4;
        }

        int[] numbers2 = new int[10];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = 5;
        }

        int[] numbers3 = new int[10];

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = 6;
        }

        int sumOfAll = sum(numbers1)
                + sum(numbers2)
                + sum(numbers3);

        int sum1 = sum(numbers1);
        int sum2 = sum(numbers2);
        int sum3 = sum(numbers3);

        sumOfAll = sum1 + sum2 + sum3;

        sumOfAll = 0;
        sumOfAll += sum(numbers1);
        sumOfAll += sum(numbers2);
        sumOfAll += sum(numbers3);

        System.out.println(sumOfAll);
    }

    public static int sum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}
