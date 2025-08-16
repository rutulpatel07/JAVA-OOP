// 3.Write a Java program to find the second largest element in an array.
import java.util.Scanner;

public class pr3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the size of array from user
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();

        // Create array
        int[] array = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Find second largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        // Display the array
        System.out.print("\nArray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        
        // Display results
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("\nNo second largest element found (all elements are same)");
        } else {
            System.out.println("\nLargest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }
        
        scanner.close();
    }
}