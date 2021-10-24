package Lesson_5_Java_Core;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/fileTest.txt");

        int count;
        char[] buff;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((count = bufferedReader.read()) != -1) {
                System.out.print((char)count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
