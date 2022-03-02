package Collection.BookSorted;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        Book b1 =  new Book("Iktidar", 650);
        Book b2 =  new Book("Kumarbaz", 400);
        Book b3 =  new Book("Ustalık", 500);
        Book b4 =  new Book("Ragmenciler", 300);
        Book b5 =  new Book("Feslegen", 345);

        TreeSet<Book> books2 = new TreeSet<>();
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        for(Book b : books2){
            System.out.println(b.getBookName() +  " " + b.getBookPage());
        }
    }
}
