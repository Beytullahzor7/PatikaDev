package IO;

import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        String data = "JAVA öğreniyorum";

        try {
            FileWriter fileWriter = new FileWriter("src/IO/output.txt");

            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
