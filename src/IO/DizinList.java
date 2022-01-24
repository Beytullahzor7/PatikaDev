package IO;

import java.io.File;

public class DizinList {
    public static void main(String[] args) {

        File file = new File("test");

        String[] fileList = file.list();

        for(String str : fileList) {
            System.out.println(str);
        }

    }
}
