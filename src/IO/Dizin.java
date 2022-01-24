package IO;

import java.io.File;

public class Dizin {
    public static void main(String[] args) {

        File file = new File("patika/test");

        boolean value = file.mkdir();
        if(value) {
            System.out.println("The new directory is created.");
        }
        else {
            System.out.println("The directory already exists.");
        }

    }
}
