/* 3. Write a Java Program to read the data from the file using
FileInputStream. */

import java.io.*;

public class pr8_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
