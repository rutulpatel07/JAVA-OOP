// // 13. Write a Java program to declare an int variable x = 5 and test these increment and decrement statements:
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(x);
// System.out.println(--x);
// System.out.println(x++);
// System.out.println(x);
// Add comments on output.

public class pr2_13 {
    public static void main(String[] args) {
        int x = 5; // initial value

        System.out.println(++x); // Pre-increment: x becomes 6, prints 6
        System.out.println(x--); // Post-decrement: prints 6, then x becomes 5
        System.out.println(x);   // Prints 5 (after previous decrement)
        System.out.println(--x); // Pre-decrement: x becomes 4, prints 4
        System.out.println(x++); // Post-increment: prints 4, then x becomes 5
        System.out.println(x);   // Prints 5 (after previous increment)
    }
}

/* Output:- 
6    ++x → x = 6, print 6
6    x-- → print 6, then x = 5
5    current value of x
4    --x → x = 4, print 4
4    x++ → print 4, then x = 5
5    current value of x         */

