package OtherSubjects2.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Mastery", 450, "Robert Green", LocalDate.of(2000,1,1));
        Book b2 = new Book("1984", 375, "George Orwell", LocalDate.of(1965,4,8));
        Book b3 = new Book("Hayvan Ciftligi", 150, "George Orwell", LocalDate.of(1972,6,2));
        Book b4 = new Book("Martin Eden", 600, "Jack London", LocalDate.of(2000,1,1));
        Book b5 = new Book("Kumarbaz", 300, "Dostoevski", LocalDate.of(1876,10,14));
        Book b6 = new Book("The Call Of The Wild", 50, "Dostoevski", LocalDate.of(1926,7,3));

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);

        bookList.stream().forEach(i -> System.out.println(i.getBookName()+ ": " +  i.getAuthorName()));

        List<Book> newBookList = bookList.stream().filter(i -> i.getPageNumber()>100).collect(Collectors.toList());
        newBookList.forEach(System.out::println);

    }
}
