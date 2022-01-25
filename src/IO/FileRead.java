package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/IO/patika.txt");

            fileReader.skip(2); //İlk 2 karakteri atlar
            int i = fileReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
