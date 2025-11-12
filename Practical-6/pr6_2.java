/* 2.	Write a program to apply the nested try blocks and multiple catch blocks.  */

public class pr6_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println("Outer try: start");
            
            try {
                System.out.println("Inner try: dividing...");
                int x = 10 / 0; // will throw ArithmeticException
                System.out.println("Inner result: " + x);
            } catch (ArithmeticException ae) {
                System.out.println("Inner catch: Caught ArithmeticException -> " + ae.getMessage());
            }

            // This line will run after inner try/catch
            System.out.println("Outer try: access array element");
            System.out.println("arr[5] = " + arr[5]); // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Outer catch: Caught ArrayIndexOutOfBoundsException -> " + aioobe.getMessage());
        } catch (Exception e) {
            // hierarchy: general Exception last
            System.out.println("Outer catch: Some other exception -> " + e.getMessage());
        } finally {
            System.out.println("Finally block of outer try: runs always.");
        }

        System.out.println("Program completed.");
    }
}
