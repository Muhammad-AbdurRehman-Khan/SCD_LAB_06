package Lab06;

/**
 * StudentCollection ADT (specification), separated from any
 * particular implementation.
 */
public interface StudentCollection {
    void addStudent(Student student);
    boolean removeStudent(int id);
    Student findStudent(int id);
    int getSize();
    boolean isEmpty();
}
