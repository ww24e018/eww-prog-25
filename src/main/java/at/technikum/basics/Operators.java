package at.technikum.basics;

public class Operators {

    public static void main(String[] args) {

        int n1 = 6;

        //System.out.println(++n1);
        //System.out.println(n1++);

        //System.out.println(n1);

        int n2 = 5;

        ++n2;
        n2 += 1;

        n2 += 7;

        int n3 = 5;
        int n4 = 5;

        //System.out.println(n3 == n4);

        boolean b1 = n3 == n4;

        //System.out.println(b1);

        boolean b2 = n1 != n4;

        boolean b3 = true;

        //System.out.println(!b3);
        //System.out.println(b3);

        b3 = !b3;

        int n6 = 10;
        int n7 = 10;

        //System.out.println(n6 <= n7);

        boolean isValid = false;
        boolean isAvailable = false;

        //System.out.println(isValid && isAvailable);

        boolean isEu = true;
        boolean hasVisa = false;

        //System.out.println(hasVisa || isEu);

        String hasAccess = isEu ? "yes" : "no";

        System.out.println(false || false && false && (true && !false));
    }
}
