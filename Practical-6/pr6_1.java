/* 1. Write a program to catch the ArithmeticException such as division by zero. */

public class pr6_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // causes division by zero

        try {
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
