package OtherSubjects2.Homework;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private LocalDate publishDate;

    public Book() {
    }

    public Book(String bookName, int pageNumber, String authorName, LocalDate publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageNumber=" + pageNumber +
                ", authorName='" + authorName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
