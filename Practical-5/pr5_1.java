// 1. Create a class named Date having three instance variables named Day, Month and Year
//    also has two set_date() to catch values of instance variables and get_date() to display
//    caught values on the output screen. And create another class DateDemo containing main() method.

import java.util.Scanner;

// Class Date with Day, Month, Year variables
class Date {
    // Instance variables
    int day, month, year;

    // Method to set values
    void set_date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    // Method to display values
    void get_date() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

// Another class containing main()
public class pr5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object of Date class
        Date d1 = new Date();

        // Taking input from user
        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        // Setting values
        d1.set_date(day, month, year);

        // Displaying values
        d1.get_date();

        sc.close();
    }
}
