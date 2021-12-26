package EmployeeManagement;

public class LabAsistan extends Asistan {

    public LabAsistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " lablara giris yapti.");
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giris yapti");
    }
}
