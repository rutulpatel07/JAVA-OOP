import java.util.Scanner;

public class pr3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of elements from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create array to store n numbers
        int[] numbers = new int[n];
        
        // Accept n numbers from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        // Calculate average
        double average = (double) sum / n;
        
        // Display the array elements
        System.out.print("\nArray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        
        // Display results
        System.out.println("\n\nSum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        
        scanner.close();
    }
}