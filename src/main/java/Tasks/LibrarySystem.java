package Lab06;

/**
 * Library System ADT (the "contract").
 * Says WHAT a library system must be able to do; says nothing about
 * HOW books are stored internally (ArrayList? HashMap? a database?).
 */
public interface LibrarySystem {
    void addBook(Book book);
    boolean removeBook(String bookId);
    Book searchBook(String bookId);
    boolean issueBook(String bookId);
    boolean returnBook(String bookId);
}
