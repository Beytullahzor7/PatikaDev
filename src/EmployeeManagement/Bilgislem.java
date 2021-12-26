package EmployeeManagement;

public class Bilgislem extends  Memur {
    private String gorev;

    public Bilgislem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulumu(){
        System.out.println(this.getAdSoyad() + " network kurulumunu yapti.");
    }
}
