package IO.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadOutput {
    public static void main(String[] args) {

        try {
            FileInputStream inputFile = new FileInputStream("src/IO/Serializable/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile); //Serileştirdiğim nesneleri alabilirim
            Car newCar = (Car) inputStream.readObject(); //Araba içerisinde buldugu ilk nesneyi alır
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
