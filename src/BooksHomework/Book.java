package BooksHomework;

public class Book {

    private String bookName;
    private int pageNum;
    private String author;
    private String date;

    public Book(String bookName, int pageNum, String author, String date) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.author = author;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageNum=" + pageNum +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
