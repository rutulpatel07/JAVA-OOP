/* 3.	Write a program to catch multiple exceptions such as ArrayIndexOutOfBounds Exception, NumberFormatException, NullPointerException and also use finally block. */

public class pr6_3 {
    public static void main(String[] args) {
        String nullStr = null;
        String number = "abc"; // will cause NumberFormatException
        int[] nums = {10, 20};

        try {
            // 1) NullPointerException
            System.out.println("Length of string: " + nullStr.length());

            // 2) NumberFormatException
            int n = Integer.parseInt(number);
            System.out.println("Parsed number: " + n);

            // 3) ArrayIndexOutOfBoundsException
            System.out.println("Accessing nums[5]: " + nums[5]);

        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException: " + npe.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Caught NumberFormatException: invalid numeric string.");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: index out of range.");
        } finally {
            System.out.println("Finally block: cleanup actions (always executed).");
        }

        System.out.println("End of program.");
    }
}
