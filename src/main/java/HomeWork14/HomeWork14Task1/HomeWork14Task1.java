package HomeWork14.HomeWork14Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class HomeWork14Task1 {
    private File file = new File("C:\\Users\\Njuta\\Desktop\\ForHomework14.txt");

    public String read() throws IOException {
        ArrayList arrayForText = new ArrayList();
        FileInputStream fileInputStream = new FileInputStream(file);
        int dataFromFile = fileInputStream.read();
        char readyText;
        while (dataFromFile != -1){
            readyText = (char)dataFromFile;
            arrayForText.add(readyText);
            dataFromFile = fileInputStream.read();
        }
        String textForUpdate = arrayForText.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
        fileInputStream.close();
        return textForUpdate;

    }
    public String forUpdatingText(String textForUpdate, String wrongWorld, String correctWorld){
        String correctText = textForUpdate.replace(wrongWorld, correctWorld);
        return correctText;
    }

    public void write(String correctText)throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(correctText.getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        HomeWork14Task1 homeWork14Task1 = new HomeWork14Task1();
        homeWork14Task1.write(homeWork14Task1.forUpdatingText(homeWork14Task1.read(), "Hello", "1234"));

    }
}
