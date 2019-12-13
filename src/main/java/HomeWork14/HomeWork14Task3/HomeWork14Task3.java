package HomeWork14.HomeWork14Task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork14Task3 {
    public static void main(String[] args) throws IOException {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Njuta\\Desktop\\Task3\\Task3From");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Njuta\\Desktop\\Task3\\Task3Where", true);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
