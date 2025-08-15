// 12. Write a Java program to print a number triangle. Example for n = 4:
// 1
// 12
// 123
// 1234

public class pr2_12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
