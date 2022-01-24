package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputByteArray {
    public static void main(String[] args) {
        byte[] dizi = {1,2,3,12,24,32,66,73};

        ByteArrayInputStream input = new ByteArrayInputStream(dizi, 2,6);
        System.out.println("Kullanılabilen Byte Sayisi: " + input.available());

        int i = input.read();
        while (i != -1){
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
