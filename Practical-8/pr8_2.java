/* 2. Write a Java Program to reverse the elements of an array read from the
file and store it in another file. Use FileInputStream and
FileOutputStream. */

import java.io.*;

public class pr8_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");

            // Read file content into a byte array
            byte[] data = fin.readAllBytes();

            // Reverse the array
            for (int i = data.length - 1; i >= 0; i--) {
                fout.write(data[i]);
            }

            fin.close();
            fout.close();
            System.out.println("Array reversed and saved in output.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
