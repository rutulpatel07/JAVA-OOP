// 8. Write a Java program to split a sentence into words, store them in an array, and display the words in reverse order
import java.util.Scanner;

public class pr3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // split sentence into words
        String[] words = sentence.split(" ");

        System.out.println("Words in reverse order:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
