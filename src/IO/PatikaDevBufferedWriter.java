package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PatikaDevBufferedWriter {
    public static void main(String[] args) {
        String data = "java 102 dersleri";

        File dosya = new File("src/IO/Output2.txt");
        try {
            FileWriter writeFile = new FileWriter(dosya);
            BufferedWriter buffWriter = new BufferedWriter(writeFile);

            buffWriter.write(data);

            buffWriter.close();
            writeFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
