package Lab06;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of LibrarySystem using a HashMap keyed by
 * bookId, so searchBook/issueBook/returnBook are O(1) lookups.
 * A client that only knows about the LibrarySystem interface has no
 * idea a HashMap is being used underneath.
 */
public class LibraryImplementation implements LibrarySystem {

    private final Map<String, Book> catalog = new HashMap<>();

    @Override
    public void addBook(Book book) {
        catalog.put(book.getBookId(), book);
    }

    @Override
    public boolean removeBook(String bookId) {
        return catalog.remove(bookId) != null;
    }

    @Override
    public Book searchBook(String bookId) {
        return catalog.get(bookId);
    }

    @Override
    public boolean issueBook(String bookId) {
        Book book = catalog.get(bookId);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        return true;
    }

    @Override
    public boolean returnBook(String bookId) {
        Book book = catalog.get(bookId);
        if (book == null || !book.isIssued()) {
            return false;
        }
        book.setIssued(false);
        return true;
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibraryImplementation();

        library.addBook(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.addBook(new Book("B002", "Effective Java", "Joshua Bloch"));

        System.out.println("Search B001 -> " + library.searchBook("B001"));

        System.out.println("Issue B001  -> " + library.issueBook("B001"));
        System.out.println("Search B001 -> " + library.searchBook("B001"));

        System.out.println("Issue B001 again (should fail, already issued) -> "
                + library.issueBook("B001"));

        System.out.println("Return B001 -> " + library.returnBook("B001"));
        System.out.println("Search B001 -> " + library.searchBook("B001"));

        System.out.println("Remove B002 -> " + library.removeBook("B002"));
        System.out.println("Search B002 after removal -> " + library.searchBook("B002"));
    }
}
