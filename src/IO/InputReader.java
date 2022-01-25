package IO;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputReader {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/IO/patika.txt");

            //Byte cinsinden verileri karakter cinsinden verilere dönüştürdük.
            InputStreamReader inputStreamReader = new InputStreamReader(file);

            int i = inputStreamReader.read();

            while (i != -1){
                System.out.print((char) i);
                i = inputStreamReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
