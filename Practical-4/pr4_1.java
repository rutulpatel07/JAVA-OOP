// 1. Create a Java class named Student that stores student name, ID, and course.Include methods to set details, display details, and create another class StudentDemo with the main() method to test it.

import java.util.Scanner;

class Student {
    String name;
    int id;
    String course;

    void setDetails(String n, int i, String c) {
        name = n;
        id = i;
        course = c;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

public class pr4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s1 = new Student();
        s1.setDetails(name, id, course);

        System.out.println("\nStudent Details:");
        s1.displayDetails();

        sc.close();
    }
}