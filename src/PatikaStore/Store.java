package PatikaStore;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.List;

public class Store {
    private int storeId;
    private String storeName;
    private static List<Brand> brandList = new ArrayList<>();

    public Store(int storeId, String storeName) {
        this.storeId = storeId;
        this.storeName = storeName;
    }

    public static void addBrand(Brand brand){
        if(getBrandList().contains(brand)){
            throw new DuplicateFormatFlagsException("This brand exist already!!!");
        }
        brandList.add(brand);
    }

    public static void deleteBrand(Brand brand){
        if(getBrandList().contains(brand)){
            brandList.remove(brand);
        }
    }

    public static void listBrand(){
        for(Brand temp : brandList){
            System.out.println("-" + temp.getBrandName());
        }
        System.out.println();
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public static List<Brand> getBrandList() {
        return brandList;
    }
}
