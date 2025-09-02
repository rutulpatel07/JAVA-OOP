// 3. Create a class Employee with empId, empName, and salary. Include a method to display details and another to calculate bonus (10% of salary). Test it using EmployeeDemo with the main() method.

import java.util.Scanner;

class Employee {

    int empId;
    String empName;
    double salary;


    void setDetails(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void displayDetails () {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus (10%): " + calculateBonus());
    }

}


public class pr4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Employee object
        Employee emp = new Employee();

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        emp.setDetails(id, name, salary);

        // Display employee details and bonus
        System.out.println("\nEmployee Details:");
        emp.displayDetails();

        sc.close();
    }
}