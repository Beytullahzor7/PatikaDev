package Collection.BookSorted;

public class Book implements Comparable<Book> {

    private String bookName;
    private int bookPage;

    public Book(String bookName, int bookPage) {
        super();
        this.bookName = bookName;
        this.bookPage = bookPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    @Override
    public int compareTo(Book b1) {
        return b1.getBookPage() - bookPage;
    }
}
