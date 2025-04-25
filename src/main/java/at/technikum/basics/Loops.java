package at.technikum.basics;

public class Loops {

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        int i2 = 0;
        for (;i2 < 10;) {
            System.out.println(i2);
            i2++;
        }

        System.out.println();

        int i3 = 0;
        while (i3 < 10) {
            System.out.println(i3);
            i3++;
        }

        boolean stop = false;

        int amount = 20;
        */
        /*
        while (true) {
            //System.out.println("Test");


            amount--;

            if (0 == amount) {
                stop = true;
            }

            if (stop) {
                break;
            }

        }
        */

        String[] names = new String[5];
        names[0] = "Aa";
        names[1] = "Bb";
        names[2] = "Cc";
        names[3] = "Dd";
        names[4] = "Ee";

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
        }

        for (String name: names) {
            System.out.println(name);
        }
    }
}
