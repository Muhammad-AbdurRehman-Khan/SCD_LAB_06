package Lab06;

/**
 * The "data" half of the Library System ADT.
 */
public class Book {
    private final String bookId;
    private final String title;
    private final String author;
    private boolean issued;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return issued; }
    public void setIssued(boolean issued) { this.issued = issued; }

    @Override
    public String toString() {
        return bookId + " | " + title + " by " + author
                + (issued ? " [ISSUED]" : " [AVAILABLE]");
    }
}
