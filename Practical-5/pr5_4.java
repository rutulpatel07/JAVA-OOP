/* 4. Write a Java program to using function overloading method to read set
of integers and floating point numbers separately and to store it in the
corresponding arrays. Again read a number from the keyboard and
check whether the number ‘d’ is present in the arrays. If it is so, print
out how many times the number ‘d’ is repeated in the array */

import java.util.Scanner;

class ArrayOps {
	// Overloaded to read int array
	void readArray(Scanner sc, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	// Overloaded to read double array (floating point)
	void readArray(Scanner sc, double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
	}

	// Overloaded to count occurrences in int array
	int countOccurrences(int[] arr, int d) {
		int count = 0;
		for (int v : arr) {
			if (v == d) count++;
		}
		return count;
	}

	// Overloaded to count occurrences in double array
	int countOccurrences(double[] arr, double d) {
		int count = 0;
		for (double v : arr) {
			if (Double.compare(v, d) == 0) count++;
		}
		return count;
	}
}

class pr5_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayOps ops = new ArrayOps();

		// Read integer array
		System.out.print("Enter number of integers: ");
		int nInt = sc.nextInt();
		int[] iarr = new int[nInt];
		System.out.println("Enter " + nInt + " integers:");
		ops.readArray(sc, iarr);

		// Read double array
		System.out.print("Enter number of floating numbers: ");
		int nDbl = sc.nextInt();
		double[] darr = new double[nDbl];
		System.out.println("Enter " + nDbl + " floating point numbers:");
		ops.readArray(sc, darr);

		// Query for integer d
		System.out.print("Enter integer d to search: ");
		int di = sc.nextInt();
		int icount = ops.countOccurrences(iarr, di);
		System.out.println(di + " is repeated " + icount + " time(s) in integer array.");

		// Query for double d
		System.out.print("Enter floating number d to search: ");
		double dd = sc.nextDouble();
		int dcount = ops.countOccurrences(darr, dd);
		System.out.println(dd + " is repeated " + dcount + " time(s) in double array.");

		sc.close();
	}
}
