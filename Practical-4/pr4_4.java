// 4. Write a program using constructor overloading to initialize an object with no arguments, one argument (name), and two arguments (name and age). Display details for each case.

class Person {
    String name;
    int age;

    // Constructor with no arguments
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one argument (name)
    Person(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two arguments (name and age)
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

// Main class to test constructor overloading
public class pr4_4 {
    public static void main(String[] args) {

        // Object with no arguments
        Person p1 = new Person();
        System.out.println("Person 1:");
        p1.displayDetails();

        // Object with one argument
        Person p2 = new Person("Alice");
        System.out.println("Person 2:");
        p2.displayDetails();

        // Object with two arguments
        Person p3 = new Person("Bob", 25);
        System.out.println("Person 3:");
        p3.displayDetails();
    }
}

