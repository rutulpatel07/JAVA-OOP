// 6. Write a Java program to check if the given number is a perfect number or not. (A number is perfect if sum of its divisors excluding itself is equal to the number.) Example: 28 → 1+2+4+7+14 = 28
public class pr2_6 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if( sum == num){
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num + " is not a perfect number.");
        }
    }
    
}
