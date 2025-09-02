// 7. Create a class Book with title, author, and price. Include methods to set details, display details, and apply discount on price. Test it using BookDemo class.

// Book class
class Book {
    String title;
    String author;
    double price;

    // Method to set book details
    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Method to apply discount (percentage)
    void applyDiscount(double percent) {
        if(percent > 0 && percent <= 100) {
            price = price - (price * percent / 100);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
}

// Main class to test Book class
public class pr4_7 {
    public static void main(String[] args) {
        // Create Book object
        Book b1 = new Book();

        // Set book details
        b1.setDetails("Java Programming", "Alice Smith", 500);

        System.out.println("Book Details Before Discount:");
        b1.displayDetails();

        // Apply discount
        b1.applyDiscount(10); // 10% discount

        System.out.println("\nBook Details After 10% Discount:");
        b1.displayDetails();
    }
}