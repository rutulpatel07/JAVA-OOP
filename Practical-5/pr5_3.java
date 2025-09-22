/* 3. Write a program to find interest of an amount given by a bank. This
program code uses function overloading to find interest having two
different forms. The first form accepts amount and percentage of
interest and the second form accepts amount and percentage two values
as parameters additionally with number of year as a parameter. */

import java.util.Scanner;

class Interest {
	// Simple interest for 1 year: (P * R) / 100
	double interest(double amount, double percent) {
		return (amount * percent) / 100.0;
	}

	// Simple interest for multiple years: (P * R * T) / 100
	double interest(double amount, double percent, int years) {
		return (amount * percent * years) / 100.0;
	}
}

class pr5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter Interest Percentage: ");
		double percent = sc.nextDouble();

		Interest calc = new Interest();
		double si1 = calc.interest(amount, percent);
		System.out.printf("Simple Interest (1 year): %.2f\n", si1);

		System.out.print("Enter Number of Years: ");
		int years = sc.nextInt();
		double si2 = calc.interest(amount, percent, years);
		System.out.printf("Simple Interest (%d years): %.2f\n", years, si2);

		sc.close();
	}
}

// Keep the public class name matching the file to avoid filename conflicts.
