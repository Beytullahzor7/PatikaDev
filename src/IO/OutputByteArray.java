package IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputByteArray {
    public static void main(String[] args) {
        String data = "Java 102 dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        byte[] dataByte = data.getBytes(); //Stringin bytea dönüşümünü sağladık

        try {
            output.write(dataByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
