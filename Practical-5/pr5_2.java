// 2. Create a class Exam having stu_name, rollno, sub_code, sub_name, InternalMarks and ExternalMarks
//    also contains two methods Calculate_result() and Show_result(). Students having marks to be
//    shown in output with his name and roll_no. A main() method is contained by Exam_demo class.
//    Use parameterized constructor with local variable named as instance variables which hides them.

import java.util.Scanner;

class Exam {
	String stu_name;
	int rollno;
	String sub_code;
	String sub_name;
	int InternalMarks;
	int ExternalMarks;

	// Additional variable to store computed result
	int totalMarks;

	// Parameterized constructor (parameters intentionally shadow instance variables)
	Exam(String stu_name, int rollno, String sub_code, String sub_name, int InternalMarks, int ExternalMarks) {
		this.stu_name = stu_name;
		this.rollno = rollno;	
		this.sub_code = sub_code;
		this.sub_name = sub_name;
		this.InternalMarks = InternalMarks;
		this.ExternalMarks = ExternalMarks;
	}

	// Calculate total (you can extend to compute percentage/grade if needed)
	void Calculate_result() {
		totalMarks = InternalMarks + ExternalMarks;
	}

	// Show the result with student's name and roll no as required
	void Show_result() {
		System.out.println("Student Name: " + stu_name);
		System.out.println("Roll No: " + rollno);
		System.out.println("Subject Code: " + sub_code);
		System.out.println("Subject Name: " + sub_name);
		System.out.println("Internal Marks: " + InternalMarks);
		System.out.println("External Marks: " + ExternalMarks);
		System.out.println("Total Marks: " + totalMarks);
	}
}

class pr5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String stu_name = sc.nextLine();

		System.out.print("Enter Roll No: ");
		int rollno = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		System.out.print("Enter Subject Code: ");
		String sub_code = sc.nextLine();

		System.out.print("Enter Subject Name: ");
		String sub_name = sc.nextLine();

		System.out.print("Enter Internal Marks: ");
		int InternalMarks = sc.nextInt();

		System.out.print("Enter External Marks: ");
		int ExternalMarks = sc.nextInt();

		Exam ex = new Exam(stu_name, rollno, sub_code, sub_name, InternalMarks, ExternalMarks);
		ex.Calculate_result();
		System.out.println();
		ex.Show_result();

		sc.close();
	}
}

