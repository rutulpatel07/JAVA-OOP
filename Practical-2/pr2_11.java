// 11. Write a Java program to print all prime numbers between 1 and n using: (a) for loop (b) while loop (c) do-while loop
public class pr2_11 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println("Prime Number Using:-");
        // (a) For loop
        System.out.println("FOR loop:");
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    c++;
            if (c == 2)
                System.out.print(i + " ");
        }

        // (b) While loop
        System.out.println("\n\nWHILE loop:");
        int i = 2;
        while (i <= n) {
            int c = 0, j = 1;
            while (j <= i) {
                if (i % j == 0)
                    c++;
                j++;
            }
            if (c == 2)
                System.out.print(i + " ");
            i++;
        }

        // (c) Do-while loop
        System.out.println("\n\nDO-WHILE loop:");
        i = 2;
        do {
            int c = 0, j = 1;
            do {
                if (i % j == 0)
                    c++;
                j++;
            } while (j <= i);
            if (c == 2)
                System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
