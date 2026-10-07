package Lab06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionTest {

    @Test
    @DisplayName("A brand new collection is empty")
    void testNewCollectionIsEmpty() {
        StudentCollection collection = new StudentCollectionImplementation();
        assertTrue(collection.isEmpty());
        assertEquals(0, collection.getSize());
    }

    @Test
    @DisplayName("addStudent increases size and stores the student")
    void testAddStudent() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(1, "Ayesha Khan", 3.72));

        assertFalse(collection.isEmpty());
        assertEquals(1, collection.getSize());
        assertEquals("Ayesha Khan", collection.findStudent(1).getName());
    }

    @Test
    @DisplayName("findStudent returns null for an id that does not exist")
    void testFindStudentNotFound() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(1, "Ayesha Khan", 3.72));

        assertNull(collection.findStudent(99));
    }

    @Test
    @DisplayName("removeStudent deletes the student and shrinks the size")
    void testRemoveStudent() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(1, "Ayesha Khan", 3.72));
        collection.addStudent(new Student(2, "Bilal Ahmed", 3.10));

        boolean removed = collection.removeStudent(1);

        assertTrue(removed);
        assertEquals(1, collection.getSize());
        assertNull(collection.findStudent(1));
    }

    @Test
    @DisplayName("removeStudent returns false for an id that does not exist")
    void testRemoveStudentNotFound() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(1, "Ayesha Khan", 3.72));

        assertFalse(collection.removeStudent(99));
    }
}
