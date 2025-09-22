/* 5. Create a Java class named Box that calculates the volume of a box. The
class should have instance variables named length, width, and height,
which are initialized with values obtained from user input. Implement a
method within the class named calculateVolume() that computes and
returns the volume of the box. */

import java.util.Scanner;

class Box {
	double length;
	double width;
	double height;

	// Parameterized constructor to initialize dimensions
	Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	// Calculate and return volume
	double calculateVolume() {
		return length * width * height;
	}
}

class pr5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length: ");
		double length = sc.nextDouble();

		System.out.print("Enter width: ");
		double width = sc.nextDouble();

		System.out.print("Enter height: ");
		double height = sc.nextDouble();

		Box box = new Box(length, width, height);
		double volume = box.calculateVolume();

		System.out.printf("Volume of the box: %.2f\n", volume);

		sc.close();
	}
}
