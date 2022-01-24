package IO.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Output {
    public static void main(String[] args) {
        //Dışarıya bir çıktı verebilmek için öncelikle output oluşturmamız gereklidir
        Car c1 = new Car("Mercedes", "AMG");

        try {
            FileOutputStream outputfile = new FileOutputStream("src/IO/Serializable/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputfile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
