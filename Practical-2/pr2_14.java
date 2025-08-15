/*14. Write a Java program to declare three variables a = 5, b = 2.5, c = 4.0, and display the result of:
System.out.println(a + b * c);
System.out.println(++a * b - c);
System.out.println(a / b + c);
Add comments explaining operator precedence.
*/

public class pr2_14 {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5, c = 4.0;

        // b * c first (multiplication before addition)
        System.out.println(a + b * c); // 5 + (2.5 * 4.0) = 5 + 10.0 = 15.0

        // ++a first (pre-increment), then multiplication, then subtraction
        System.out.println(++a * b - c); // (++5=6) → (6 * 2.5) = 15.0 → 15.0 - 4.0 = 11.0

        // a / b first (division before addition), then add c
        System.out.println(a / b + c); // 6 / 2.5 = 2.4 → 2.4 + 4.0 = 6.4
    }
}


