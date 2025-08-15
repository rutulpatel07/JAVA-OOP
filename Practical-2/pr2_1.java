// 1. Write a Java program to take three numbers as command line arguments and print the maximum number.
public class pr2_1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = num1;

        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if(num2>num1 && num2>num3){
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("Max number is:"+max);
    }
    
}
