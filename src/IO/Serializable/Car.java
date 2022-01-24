package IO.Serializable;

import java.io.Serializable;

public class Car implements Serializable {

    public String brand;
    public String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
