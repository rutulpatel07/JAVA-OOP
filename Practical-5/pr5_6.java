/* 6. Create abstract class called Shape which has three sub classes say
Triangle, Rectangle, and Circle. Define one method area() in abstract
class and override this area() in these three subclasses to calculate area
for specific object i.e. area() of Triangle subclass should calculate area
of triangle. Same for rectangle, circle. */

import java.util.Scanner;

abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double area() {
		return 0.5 * base * height;
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}

class ShapeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Triangle
		System.out.print("Enter base of triangle: ");
		double tBase = sc.nextDouble();
		System.out.print("Enter height of triangle: ");
		double tHeight = sc.nextDouble();
		Shape tri = new Triangle(tBase, tHeight);
		System.out.printf("Area of Triangle: %.2f\n", tri.area());

		// Rectangle
		System.out.print("Enter length of rectangle: ");
		double rLen = sc.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double rWid = sc.nextDouble();
		Shape rect = new Rectangle(rLen, rWid);
		System.out.printf("Area of Rectangle: %.2f\n", rect.area());

		// Circle
		System.out.print("Enter radius of circle: ");
		double radius = sc.nextDouble();
		Shape cir = new Circle(radius);
		System.out.printf("Area of Circle: %.2f\n", cir.area());

		sc.close();
	}
}

// Keep the public class name matching the file to avoid filename conflicts.
public class pr5_6 { }
