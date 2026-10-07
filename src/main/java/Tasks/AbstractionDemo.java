package Lab06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Programming to an Abstraction.
 * The variable "students" is declared using the List interface type,
 * so the client code (this class) never depends on which concrete
 * class (ArrayList, LinkedList, ...) is actually doing the work.
 */
public class AbstractionDemo {
    public static void main(String[] args) {

        List<String> students;

        // First: backed by an ArrayList
        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("Backed by ArrayList  -> " + students
                + "   (runtime type: " + students.getClass().getSimpleName() + ")");

        // Reassign the SAME variable to a completely different
        // concrete implementation. The code below never changes.
        students = new LinkedList<>();
        students.add("Sara");
        System.out.println("Backed by LinkedList -> " + students
                + "   (runtime type: " + students.getClass().getSimpleName() + ")");

        System.out.println();
        System.out.println("The variable's declared type never changed (still List<String>); "
                + "only the object it points to changed. That is what "
                + "'programming to an interface, not an implementation' means.");
    }
}
