// 4. Write a Java program to merge two arrays and display the merged array in ascending order.
import java.util.Scanner;
public class pr3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the size of first array
        System.out.print("Enter the number of elements in first array: ");
        int n1 = sc.nextInt();
        // Create first array
        int[] array1 = new int[n1];
        // Input elements for first array
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        // Get the size of second array
        System.out.print("Enter the number of elements in second array: ");
        int n2 = sc.nextInt();
        // Create second array
        int[] array2 = new int[n2];
        // Input elements for second array
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }
        // Merge arrays
        int[] mergedArray = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = array1[i];
        }  
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = array2[i];
        }
        // Sort merged array in ascending order
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[i] > mergedArray[j]) {
                    // Swap elements
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }
        // Display merged array
        System.out.println("Merged array in ascending order:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
        sc.close(); 
    }
}
