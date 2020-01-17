package HomeWork14.HomeWork14Task4;

import java.io.*;

public class HomeWork14Task4 {
    File file = new File("C:\\forIO\\from\\Text Document (.txt)");
    File fileForData = new File("C:\\forIO\\where\\Text Document (.txt)");
    String fileName = file.getName();
    String path = file.getAbsolutePath();

    public static void main(String[] args) throws IOException {
        HomeWork14Task4 homeWork14Task4 = new HomeWork14Task4();
        homeWork14Task4.sendData();

    }

    public void sendData() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileForData, true);
        fileOutputStream.write(fileName.getBytes());
        fileOutputStream.write(path.getBytes());
        fileOutputStream.close();
    }
}



