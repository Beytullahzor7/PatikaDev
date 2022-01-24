package IO;

import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        String data = "Patika ile Java Öğreniyorum !!";
        try {
            FileOutputStream output = new FileOutputStream("/src/IO/output.txt");
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
