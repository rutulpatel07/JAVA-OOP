// 9. Write a Java program to find the maximum and minimum of four numbers using nested if-else.
public class pr2_9 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        
        // Find maximum using nested if-else
        int max = (num1 > num2) ? 
                  ((num1 > num3) ? ((num1 > num4) ? num1 : num4) : ((num3 > num4) ? num3 : num4)) :
                  ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));
        
        // Find minimum using nested if-else
        int min = (num1 < num2) ? 
                  ((num1 < num3) ? ((num1 < num4) ? num1 : num4) : ((num3 < num4) ? num3 : num4)) :
                  ((num2 < num3) ? ((num2 < num4) ? num2 : num4) : ((num3 < num4) ? num3 : num4));
        
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}