// 6. Write a Java program that counts the number of vowels, consonants, digits, and special characters in a given string.
import java.util.Scanner;
public class pr3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        str = str.toLowerCase(); // convert to lowercase for easy checking

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // alphabet
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch != ' ') { // ignore spaces
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);

        sc.close();
    }
}
