package IO;

import java.io.File;

public class Delete {
    public static void main(String[] args) {

        File file = new File("patika.txt");

        boolean value = file.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }

    }
}
