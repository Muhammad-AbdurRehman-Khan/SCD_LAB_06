package Lab06;

/**
 * Demonstrates data encapsulation: the internal state (id, name, cgpa)
 * is hidden (private) and can only be read through public getters.
 *
 * NOTE: private fields are only protected from OTHER classes.
 * Code written inside Student.java itself (including this very
 * main() method) is part of the Student class, so it is still
 * allowed to touch id/name/cgpa directly - that is normal, expected
 * Java behaviour, not a bug. The real compile-error proof of
 * encapsulation has to come from a DIFFERENT class - see
 * EncapsulationDemo.java.
 */
public class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Ayesha Khan", 3.72);

        // Encapsulation in action: OUTSIDE code can only reach the
        // data through these public getters.
        System.out.println("ID:   " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());

        System.out.println();
        System.out.println("See EncapsulationDemo.java for the actual compile-error proof: "
                + "a class OTHER than Student cannot write 's.id = 5;' directly.");
    }
}