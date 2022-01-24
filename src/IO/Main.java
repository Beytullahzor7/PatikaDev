package IO;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("src/IO/patika.txt");

        /*try {
            if(dosya.createNewFile()){
                System.out.println(dosya.getName() + " dosyasi olusturuldu.");
            }else {
                System.out.println(dosya.getName() + " dosyasi zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        //dosya.delete();

        //File dizin = new File("test");
        //dizin.mkdir(); Dizin oluşturmak

        /* File dizin = new File("patika/dev");
           dizin.mkdirs(); Olmayan üst dizinleri de oluşturur
         */
    }
}
