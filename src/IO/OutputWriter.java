package IO;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputWriter {
    public static void main(String[] args) {
        String data = "Java ögrenmeye devam ediyorum";

        try {
            FileOutputStream fileOutput = new FileOutputStream("src/IO/patika.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
            fileWriter.write(data);

            fileWriter.getEncoding();
            fileWriter.close();
            fileOutput.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
