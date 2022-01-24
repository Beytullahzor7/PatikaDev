package IO;

import java.io.FileInputStream;

public class FileInput2 {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            // 5 byte atlanacaktır
            input.skip(5);
            System.out.println("5 bytelık veri atlandı : ");

            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
