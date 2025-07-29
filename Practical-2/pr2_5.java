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
