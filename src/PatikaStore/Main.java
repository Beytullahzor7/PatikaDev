package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Store patikaStore = new Store(1,"PatikaStore");

        Brand samsung = new Brand(1,"Samsung");
        Brand lenovo = new Brand(2,"Lenovo");
        Brand apple = new Brand(3,"Apple");
        Brand huawei = new Brand(4,"Huawei");
        Brand casper = new Brand(5,"Casper");
        Brand asus = new Brand(6,"Asus");
        Brand hp = new Brand(7,"HP");
        Brand xiaomi = new Brand(8,"Xiaomi");
        Brand monster = new Brand(9,"Monster");

        Brand[] brandArray = {samsung,lenovo,apple,huawei,casper,asus,hp,xiaomi,monster};
        for(int i=0; i<brandArray.length; i++){
            patikaStore.getBrandList().add(brandArray[i]); //All default brands added to brandList
        }
        //System.out.println(patikaStore.getBrandList().toString());

        Products t1 = new Telephone(1,2000,10,20,"Galaxy","6MB",
                6.1,"128GB",4000,"White");

        Products n1 = new NoteBook(1,2000,10,20,
                "AbraA5","16GB",1920.0,"256GB");

        t1.setBrand(samsung);
        n1.setBrand(monster);

        samsung.addProduct(t1,1);
        monster.addProduct(n1,2);

        System.out.println("Patika Store Urun Yonetim Paneli");
        System.out.println("1- Notebook Islemleri\n" +
                           "2- Cep Telefonu Islemleri\n" +
                           "3- Marka Listele\n" +
                           "0- Cikis Yap");

        int choice = input.nextInt();
        switch (choice){
            case 1:
                monster.listNotebooks();
                break;
            case 2:
                samsung.listTelephones();
                break;
            case 3:
                patikaStore.listBrand();
            default:
                System.out.println("Cikis Yapiliyor...");
        }
    }
}
