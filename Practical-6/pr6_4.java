/* 4.	Write a program to throw your own exception by extending the Exception class. */

public class pr6_4 {
    // Method that validates a number and throws custom exception if invalid
    public static void validatePositive(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Negative value not allowed: " + value);
        }
        System.out.println("Value is positive: " + value);
    }

    public static void main(String[] args) {
        try {
            validatePositive(5);   // OK
            validatePositive(-3);  // will throw MyCustomException
        } catch (MyCustomException mce) {
            System.out.println("Caught MyCustomException: " + mce.getMessage());
        } finally {
            System.out.println("Finally block: runs after handling custom exception.");
        }

        System.out.println("Program finished.");
    }
}
