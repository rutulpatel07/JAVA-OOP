/* 4. Write a Java Program to read the data from the file and copy it on
another file. */

import java.io.*;

public class pr8_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("copy.txt");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }

            fin.close();
            fout.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
