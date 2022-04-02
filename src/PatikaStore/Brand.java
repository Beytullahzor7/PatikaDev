package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class Brand implements Comparable<Brand> {
    private int brandId;
    private String brandName;
    private static List<Products> Allproducts = new ArrayList<>();
    private static List<Telephone> telephoneList = new ArrayList<>();
    private static List<NoteBook> noteBookList = new ArrayList<>();


    public Brand(int brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public static void listProducts(){
        for(Products temp : Allproducts){
            System.out.println("-" + temp.getName());
        }
        System.out.println();
    }

    public static void listTelephones(){
        for(Products temp : telephoneList){
            System.out.println("-" + temp.getName());
        }
        System.out.println();
    }

    public static void listNotebooks(){
        for(Products temp : noteBookList){
            System.out.println("-" + temp.getName());
        }
        System.out.println();
    }

    public static void addProduct(Products p, int type){
        if(type == 1){
            Allproducts.add(p);
            telephoneList.add((Telephone) p);
        }
        if(type == 2){
            Allproducts.add(p);
            noteBookList.add((NoteBook) p);
        }
    }

    public static void deleteProductsById(int productId){
        Allproducts.remove(productId-1);
    }

    @Override
    public int compareTo(Brand o) {
        return brandName.compareTo(o.getBrandName());
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static List<Products> getProducts() {
        return Allproducts;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
