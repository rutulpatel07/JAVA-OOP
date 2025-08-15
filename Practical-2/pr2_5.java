// 5. Write a Java program to find the sum of digits of a number using a command line argument. Example: 123 → 1+2+3 = 6
public class pr2_5 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
    }
    
}
