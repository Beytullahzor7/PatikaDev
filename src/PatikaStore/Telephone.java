package PatikaStore;

public class Telephone extends Products {
    private int telephoneId;
    private String memory;
    private int battery;
    private String color;

    public Telephone(int telephoneId, int unitPrice, int discountRate, int amount, String name,
                     String RAM, double screenSize, String memory, int battery, String color) {
        super(unitPrice, discountRate, amount, name, RAM, screenSize);
        this.memory = memory;
        this.battery = battery;
        this.color = color;
        this.telephoneId = telephoneId;
    }

    public int getTelephoneId() {
        return telephoneId;
    }

    public void setTelephoneId(int telephoneId) {
        this.telephoneId = telephoneId;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
