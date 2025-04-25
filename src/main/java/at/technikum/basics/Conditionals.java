package at.technikum.basics;

public class Conditionals {

    public static void main(String[] args) {

        boolean isValid = false;
        boolean isAvailable = false;

        if (isValid) {
            //System.out.println("User registered");
        } else if (isAvailable) {

        } else {

        }

        boolean isEu = true;

        String access = null; // ""
        if (isEu) {
            access = "yes";
        } else if (false){
            access = "no";
        }

        // if (access == null)
        // if (null == access)

        // if (access = null)
        // if (null = access)

        if (!isEu == false) {

        }

        if (access != null) {
            // System.out.println(access + " Test");
        }

        int grade = 5;
        
        if (++grade == 1) {
            // System.out.println("Grade not valid");
        }
    }
}
