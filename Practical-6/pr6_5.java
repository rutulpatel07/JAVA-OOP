/* 5.	Write a program that shows the use of throws keyword. */

// Demonstrates broadcasting an exception using 'throws' and handling it where called.
public class pr6_5 {

    // This method declares that it throws Exception (checked)
    public static void riskyOperation(int x) throws Exception {
        if (x == 0) {
            throw new Exception("x must not be zero.");
        }
        System.out.println("riskyOperation succeeded with x = " + x);
    }

    public static void main(String[] args) {
        try {
            riskyOperation(10); // OK
            riskyOperation(0);  // will cause Exception declared by throws
        } catch (Exception e) {
            System.out.println("Caught Exception from riskyOperation: " + e.getMessage());
        } finally {
            System.out.println("Finally block in main: always executes.");
        }

        System.out.println("End of main.");
    }
}
