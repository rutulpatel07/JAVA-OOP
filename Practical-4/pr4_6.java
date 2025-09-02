// 6. Write a Java program using method overloading to find maximum of two integers, three integers, and two double values.

class MaxFinder {

    int max (int a, int b) {
        return (a > b) ? a : b;
    }

    int max (int a, int b, int c) {
        int temp = (a > b) ? a : b;
        return (temp > c) ? temp : c;
    }

    double max (double x, double y) {
        return (x > y) ? x : y;
    }

}


public class pr4_6 {
public static void main(String[] args) {
    
    MaxFinder mf = new MaxFinder();

    int a = 10, b = 20, c = 15;
    double x = 12.5, y = 9.8;

    System.out.println("Maximum of " + a + " and " + b + " is: " + mf.max(a, b));
    System.out.println("Maximum of " + a + ", " + b + ", " + c + " is: " + mf.max(a, b, c));
    System.out.println("Maximum of " + x + " and " + y + " is: " + mf.max(x, y));

}    
}
