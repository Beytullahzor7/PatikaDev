package IO;

import java.io.File;

public class Create {
    public static void main(String[] args) {

        File file = new File("patika.txt");

        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
