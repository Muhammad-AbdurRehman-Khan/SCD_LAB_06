package Lab06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractionDemoTest {

    @Test
    @DisplayName("A List variable backed by ArrayList behaves correctly through the interface")
    void testListBackedByArrayList() {
        List<String> students = new ArrayList<>();
        students.add("Ali");

        assertEquals(1, students.size());
        assertEquals("Ali", students.get(0));
        assertTrue(students instanceof ArrayList);
    }

    @Test
    @DisplayName("The same variable reassigned to LinkedList still behaves correctly through the interface")
    void testListBackedByLinkedList() {
        List<String> students = new LinkedList<>();
        students.add("Sara");

        assertEquals(1, students.size());
        assertEquals("Sara", students.get(0));
        assertTrue(students instanceof LinkedList);
    }

    @Test
    @DisplayName("Reassigning the variable does not change its declared (interface) type")
    void testReassignmentKeepsInterfaceContract() {
        List<String> students = new ArrayList<>();
        students.add("Ali");
        assertEquals(1, students.size());

        students = new LinkedList<>();
        students.add("Sara");

        // Still a List, still supports the same operations,
        // even though the concrete class underneath changed.
        assertEquals(1, students.size());
        assertEquals("Sara", students.get(0));
    }
}
