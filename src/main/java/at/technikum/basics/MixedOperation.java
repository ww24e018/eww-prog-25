package at.technikum.basics;

public class MixedOperation {

    public static void main(String[] args) {
        System.out.printf("%f\n", 1. + 3 /4 );
        System.out.printf("%f\n", 1 + 0.0);
        // 1.000000 oder 1
        System.out.println();
        System.out.printf("%f\n", 1 + 3./4 );
        System.out.printf("%f\n", 1 + 3 /4.);
        System.out.printf("%f\n", 1 + (double) 3 /4);
        System.out.printf("%d\n", (int) (1 + 3. /4));
    }
}
