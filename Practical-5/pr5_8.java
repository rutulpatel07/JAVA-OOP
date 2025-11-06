// 8. Interface `shape` with area() and implementations for Rectangle, Triangle, and Sphere.

import java.util.Scanner;

// Use lowercase name `shape` to avoid conflict with existing abstract `Shape` class from pr5_6
interface shape {
	double area();
}

class RectangleS implements shape {
	double length;
	double width;

	RectangleS(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}
}

class TriangleS implements shape {
	double base;
	double height;

	TriangleS(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * base * height;
	}
}

class Sphere implements shape {
	double radius;

	Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// Surface area of a sphere: 4 * pi * r^2
		return 4.0 * Math.PI * radius * radius;
	}
}

class ShapeInterfaceDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Rectangle
		System.out.print("Enter length of rectangle: ");
		double rLen = sc.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double rWid = sc.nextDouble();
		shape rect = new RectangleS(rLen, rWid);
		System.out.printf("Area of Rectangle: %.2f\n", rect.area());

		// Triangle
		System.out.print("Enter base of triangle: ");
		double tBase = sc.nextDouble();
		System.out.print("Enter height of triangle: ");
		double tHeight = sc.nextDouble();
		shape tri = new TriangleS(tBase, tHeight);
		System.out.printf("Area of Triangle: %.2f\n", tri.area());

		// Sphere
		System.out.print("Enter radius of sphere: ");
		double rad = sc.nextDouble();
		shape sph = new Sphere(rad);
		System.out.printf("Surface Area of Sphere: %.2f\n", sph.area());

		sc.close();
	}
}

// Keep the public class name matching the file to avoid filename conflicts.
public class pr5_8 { }
