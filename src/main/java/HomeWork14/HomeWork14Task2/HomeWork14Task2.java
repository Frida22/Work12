package HomeWork14.HomeWork14Task2;

import java.io.*;

public class HomeWork14Task2 {
    public static void main(String[] args) throws IOException {
        HomeWork14Task2 homeWork14Task2 = new HomeWork14Task2();
        homeWork14Task2.copyFiles("C:\\Users\\Njuta\\Desktop\\New folder\\New Text Document (2).txt");
    }

    private File whereToCopy = new File("C:\\Users\\Njuta\\Desktop\\New folder\\forSaveCopy.txt");

    public void copyFiles(String pathFromWhere) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathFromWhere);
        FileOutputStream fileOutputStream = new FileOutputStream(whereToCopy, true);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
