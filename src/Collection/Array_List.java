package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(); //polymorphism

        liste.add(4);
        liste.add(7);
        liste.add(3);
        liste.add(9);
        liste.add(6);
        liste.add(7);
        liste.add(null);

        System.out.println("Size "+ liste.size());
        System.out.println("İndex " + liste.get(3));
        System.out.println("index numarası " + liste.indexOf(6));
        System.out.println("index numarası " + liste.lastIndexOf(7));
        liste.add(6,10); //6. indexe 10 değerini atar
        liste.set(7, 15); //7. indexse karşılık gelen null değerini kaldırıp yerine 15 değerini atar

        System.out.println(liste.contains(7)); //true or false

        for(Integer i: liste){
            System.out.println(i);
        }

        List<Integer> liste2 = new ArrayList<>(); //listenin tüm elemanlarını yeni olusturdugumuz liste2 içerisine ekledik
        liste2.addAll(liste);
        System.out.println(liste2);

        List<Integer> list3 = liste.subList(0,5); //alt liste olusturmak

        Iterator<Integer> itr = list3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
