package Lab06;

/**
 * This class is DELIBERATELY separate from Student.java.
 * It proves encapsulation the correct way: an OUTSIDE class trying
 * to touch Student's private fields directly must fail to compile.
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student(1, "Ayesha Khan", 3.72);

        // This is the ONLY legal way for an outside class to read
        // the data - through the public getters.
        System.out.println("ID:   " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());

        // Uncomment the line below to see the real compile error:
        //
//           s.id = 5;
        //
        // javac reports:
        //   "id has private access in labtask06.Student"
        //
        // This fails because EncapsulationDemo is a DIFFERENT class
        // from Student - unlike Student's own main(), this class has
        // no key to Student's private fields. That is the actual
        // proof that encapsulation is enforced by the compiler.
    }
}