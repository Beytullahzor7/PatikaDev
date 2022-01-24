package IO;
import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt"); //var olan dosyayı okur

            System.out.println("Dosyadaki veriler: ");

            // İlk baytı okur
            int i = input.read();

            while (i != -1) { //boş işse -1 döndürür. -1 olmadıgı sürece döngünün çalışmasını sağladık
                // Byte to char
                System.out.print((char) i);
                // Dosyadan sonraki baytı okur
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
