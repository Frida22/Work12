package HomeWork14.Training;

import HomeWork14.HomeWork14Task3.HomeWork14Task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public  class HomeWorkIO {

    private File file = new File("C:\\Users\\Njuta\\Desktop\\ForHomework14.txt");
    private String forNewFile1;

    public void read() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        int dataFromFile = fileInputStream.read();
        char readyText;
        while (dataFromFile != -1){
            readyText = (char)dataFromFile;
            System.out.print(readyText);
            dataFromFile = fileInputStream.read();

        }
        fileInputStream.close();
    }

    public void write(String anotherText)throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(anotherText.getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        HomeWorkIO homeWorkIO = new HomeWorkIO();
        homeWorkIO.read();
        homeWorkIO.write("1234");
    }
}