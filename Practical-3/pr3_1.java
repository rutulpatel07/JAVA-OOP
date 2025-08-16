// 1. Write a Java program to accept n numbers from the user, store them in an array, and find the sum and average of the elements.
import java.util.Scanner;

public class pr3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of elements from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Create array to store n numbers
        int[] numbers = new int[n];
        
        // Accept n numbers from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        // Calculate average
        double average = (double) sum / n;
        
        // Display results
        System.out.println("\n\nSum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        
        sc.close();
    }
}