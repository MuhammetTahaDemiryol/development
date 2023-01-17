

public class Book implements Comparable<Book>{
    private String bookName;
    private int numberOfPages;
    private String authorName;
    private int publicationYear;



    public Book(String bookName, int numberOfPages, String authorName, int publicationYear) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book b) {
        return getBookName().compareTo(b.getBookName());
    }

}