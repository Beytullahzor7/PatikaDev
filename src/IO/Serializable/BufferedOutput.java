package IO.Serializable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutput {
    public static void main(String[] args) {

        String data = "Patika ile Java102 Dersleri";

        try {
            // FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            output.write(array);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
