// . Write a Java program to create two 2D arrays and find their transpose.
import java.util.Scanner;

public class pr3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two 3x3 arrays
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        
        // Input elements for first 3x3 array
        System.out.println("Enter elements for first 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }
        
        // Input elements for second 3x3 array
        System.out.println("\nEnter elements for second 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }
        
        // Create transpose arrays (also 3x3)
        int[][] transpose1 = new int[3][3];
        int[][] transpose2 = new int[3][3];
        
        // Calculate transpose of first array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose1[j][i] = array1[i][j];
            }
        }
        
        // Calculate transpose of second array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose2[j][i] = array2[i][j];
            }
        }
        
        // Display results
        System.out.println("\n=== FIRST ARRAY ===");
        System.out.println("Original Array:");
        displayArray(array1);
        System.out.println("Transpose:");
        displayArray(transpose1);
        
        System.out.println("\n=== SECOND ARRAY ===");
        System.out.println("Original Array:");
        displayArray(array2);
        System.out.println("Transpose:");
        displayArray(transpose2);
        
        scanner.close();
    }
    
    // Method to display a 3x3 array
    public static void displayArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}