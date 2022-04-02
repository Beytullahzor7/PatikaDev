package BooksHomework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Book book1 =new Book("Savas ve Baris",284,"Tolstoy","10/04/1867");
        Book book2 =new Book("İnsan Gelecegini Nasıl Kurar",280,"İlber Ortaylı","05/03/2022");
        Book book3 =new Book("Kumarbaz",315,"Dostoevski","11/09/1867");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        listAllBook();
        System.out.println("--------");
        listOfBookOrderByPage();
        System.out.println("--------");
        mapBookNameAndAuthor();
    }

    public static void listAllBook(){
        books.forEach(book -> System.out.println(book.toString()));
    }

    public static void listOfBookOrderByPage(){
        books
                .stream()
                .filter(book -> book.getPageNum() > 250)
                .forEach(book -> System.out.println(book.getBookName() + " -> " + book.getPageNum()));
    }

    public static void mapBookNameAndAuthor(){
        books
                .stream()
                .map(book -> (book.getBookName() + "-" + book.getAuthor()))
                .forEach(System.out::println);
    }
}
