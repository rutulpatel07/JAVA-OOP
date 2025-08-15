// 4. Write a Java program to check whether a given number is even or odd using a command line argument.
public class pr2_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    
}
