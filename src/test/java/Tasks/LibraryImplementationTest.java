package Lab06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryImplementationTest {

    @Test
    @DisplayName("addBook then searchBook finds the same book")
    void testAddAndSearchBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B001", "Clean Code", "Robert C. Martin"));

        Book found = library.searchBook("B001");

        assertNotNull(found);
        assertEquals("Clean Code", found.getTitle());
        assertFalse(found.isIssued());
    }

    @Test
    @DisplayName("searchBook returns null for a book that was never added")
    void testSearchBookNotFound() {
        LibrarySystem library = new LibraryImplementation();
        assertNull(library.searchBook("B999"));
    }

    @Test
    @DisplayName("issueBook marks an available book as issued")
    void testIssueBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B001", "Clean Code", "Robert C. Martin"));

        boolean issued = library.issueBook("B001");

        assertTrue(issued);
        assertTrue(library.searchBook("B001").isIssued());
    }

    @Test
    @DisplayName("issueBook fails if the book is already issued")
    void testIssueBookAlreadyIssuedFails() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.issueBook("B001");

        assertFalse(library.issueBook("B001"));
    }

    @Test
    @DisplayName("returnBook makes an issued book available again")
    void testReturnBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.issueBook("B001");

        boolean returned = library.returnBook("B001");

        assertTrue(returned);
        assertFalse(library.searchBook("B001").isIssued());
    }

    @Test
    @DisplayName("removeBook deletes the book so it can no longer be found")
    void testRemoveBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B002", "Effective Java", "Joshua Bloch"));

        boolean removed = library.removeBook("B002");

        assertTrue(removed);
        assertNull(library.searchBook("B002"));
    }
}
