// 5. Write a Java program to check if a given string is a palindrome or not.
import java.util.Scanner;
public class pr3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();  // take input
        String rev = "";

        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // check palindrome
        if (str.equals(rev))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");

        sc.close();
    }
}
