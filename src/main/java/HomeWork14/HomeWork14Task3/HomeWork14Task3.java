package HomeWork14.HomeWork14Task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork14Task3 {
    public static void main(String[] args) throws IOException {
        HomeWork14Task3 homeWork14Task3 = new HomeWork14Task3();
        homeWork14Task3.read();

    }
    private FileInputStream inputStream;
    private FileOutputStream outputStream;
    private String pathFrom = "C:\\forIO\\where\\Text Document (.txt)";
    private String pathWhere = "C:\\forIO\\from\\Text Document (.txt)";

    public void read() throws IOException {
        inputStream = new FileInputStream(pathFrom);
        outputStream = new FileOutputStream(pathWhere);
        int data = inputStream.read();
        char ch;
        while (data != -1) {
            ch = (char) data;
            data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }


}

