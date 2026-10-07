package Lab06;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of StudentCollection backed by an ArrayList.
 */
public class StudentCollectionImplementation implements StudentCollection {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }

    public static void main(String[] args) {
        StudentCollection collection = new StudentCollectionImplementation();

        System.out.println("isEmpty() on a fresh collection -> " + collection.isEmpty());

        collection.addStudent(new Student(1, "Ayesha Khan", 3.72));
        collection.addStudent(new Student(2, "Bilal Ahmed", 3.10));
        collection.addStudent(new Student(3, "Hamza Tariq", 3.95));

        System.out.println("getSize() after 3 additions -> " + collection.getSize());

        Student found = collection.findStudent(2);
        System.out.println("findStudent(2) -> "
                + (found != null ? found.getName() + " (CGPA " + found.getCgpa() + ")" : "not found"));

        boolean removed = collection.removeStudent(1);
        System.out.println("removeStudent(1) -> " + removed);
        System.out.println("getSize() after removal -> " + collection.getSize());

        System.out.println("findStudent(1) after removal -> " + collection.findStudent(1));
    }
}
