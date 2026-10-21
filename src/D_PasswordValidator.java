/***
 *! Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 *! It must contain at least one number,
 *! It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public boolean isValid;

    public D_PasswordValidator() {
        String password = "mypassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        /* TODO: your code goes here */

        if (password.equalsIgnoreCase("password")) {
            isValid = false;
            System.out.println("password" + isValid);
        } else {
            int x = 0;
            //number
            while (x < password.length()) {
                if (password.codePointAt(x) < 47 || password.codePointAt(x) > 59) {
                    //  if(password.charAt(x) != 0 || password.charAt(x) !=1 || password.charAt(x) != 2 ||
                    //          password.charAt(x) != 3 || password.charAt(x) != 4|| password.charAt(x) != 5
                    //          || password.charAt(x) != 6 || password.charAt(x) != 7 || password.charAt(x) != 8
                    //          || password.charAt(x) != 9){
                    isValid = false;
                    System.out.println("number" + isValid);
                    x++;
                }
            }

            int y = 0;
            while (y < password.length()) {
                if (password.codePointAt(y) < 65 || password.codePointAt(y) > 90) {
                    isValid = true;
                    System.out.println("uppercase" + isValid);
                    y++;
                } else {
                    isValid = false;
                }
            }


            //upper case number
        }
            return true; // this is a temporary return to avoid errors

    }
}



