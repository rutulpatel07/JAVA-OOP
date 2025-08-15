// 7. Write a Java program to generate and print n terms of the Harmonic series. Harmonic series: 1 + 1/2 + 1/3 + 1/4 + ...
public class pr2_7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        System.out.println("Harmonic series with " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {            
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }
        }
        
    }
}
