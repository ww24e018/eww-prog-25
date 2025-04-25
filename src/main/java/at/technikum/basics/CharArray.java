package at.technikum.basics;

public class CharArray {

    public static void main(String[] args) {

        char[] greeting = new char[5];

        greeting[0] = 'h';
        greeting[1] = 'e';
        greeting[2] = 'l';
        greeting[3] = 'l';
        greeting[4] = 'o';

        printArray(greeting);

        char[] name = { 'm', 'a', 'r', 'v', 'i', 'n' };

        printArray(name);

        char[] city = {'V', 'i', 'e', 'n', 'n', 'a'};

        printArray(city);

        String[] names = { "Marvin", "Max", "Lara" };
        greetMultiple(names);
    }

    private static void greetMultiple(String[] names) {
        int amount = 200 / names.length;

        for (int i = 0; i < names.length; i++) {
            greet(names[i], amount);
        }
    }

    private static void greet(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.printf("Hello %s\n", name);
        }
    }

    private static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}


