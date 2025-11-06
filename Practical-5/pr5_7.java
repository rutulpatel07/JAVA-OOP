/* 7. Write a program to implement Multiple inheritance using interface. */

import java.util.Scanner;

// First interface for basic identity details
interface PersonInfo {
	void setPerson(String name, int rollNo);
	void showPerson();
}

// Second interface for marks details
interface MarksInfo {
	void setMarks(int internal, int external);
	void showMarks();
}

// Class implementing multiple interfaces (Multiple Inheritance via interfaces)
class StudentReport implements PersonInfo, MarksInfo {
	String name;
	int rollNo;
	int internal;
	int external;

	@Override
	public void setPerson(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public void showPerson() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
	}

	@Override
	public void setMarks(int internal, int external) {
		this.internal = internal;
		this.external = external;
	}

	@Override
	public void showMarks() {
		System.out.println("Internal Marks: " + internal);
		System.out.println("External Marks: " + external);
		System.out.println("Total: " + (internal + external));
	}
}

// Demo class
class InterfaceDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Roll No: ");
		int roll = sc.nextInt();

		System.out.print("Enter Internal Marks: ");
		int internal = sc.nextInt();

		System.out.print("Enter External Marks: ");
		int external = sc.nextInt();

		StudentReport sr = new StudentReport();
		sr.setPerson(name, roll);
		sr.setMarks(internal, external);

		System.out.println();
		sr.showPerson();
		sr.showMarks();

		sc.close();
	}
}

// Keep the public class name matching the file to avoid filename conflicts.
public class pr5_7 { }
