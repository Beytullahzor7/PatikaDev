package PatikaStore;

public abstract class Products {
    private int unitPrice;
    private int discountRate;
    private int amount;
    private String name;
    private String RAM;
    private double screenSize;
    private Brand brand;

    public Products(int unitPrice, int discountRate, int amount, String name, String RAM, double screenSize) {
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amount = amount;
        this.name = name;
        this.RAM = RAM;
        this.screenSize = screenSize;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
