# Lab 06 – Abstract Data Types (ADT)

**University of Engineering and Technology, Abbottabad Campus**
**Course:** Software Construction (5th Semester, Software Engineering)
**Instructor:** Engr. Rizwan Shah

## Objective

Implement simple Abstract Data Types (ADTs) in Java, use interfaces to define contracts, and apply the principles of abstraction and encapsulation.

## What Was Implemented

| Task | Topic | Files |
|------|-------|-------|
| 1 | Stack ADT (LIFO) | `Stack.java`, `ArrayStack.java`, `ArrayStackTest.java` |
| 2 | Data Encapsulation | `Student.java`, `EncapsulationDemo.java` |
| 3 | Programming to an Abstraction | `AbstractionDemo.java`, `AbstractionDemoTest.java` |
| 4 | Library System ADT Design | `LibrarySystem.java`, `Book.java`, `LibraryImplementation.java`, `LibraryImplementationTest.java` |
| 5 | Student Management System | `StudentCollection.java`, `StudentCollectionImplementation.java`, `StudentCollectionTest.java` |

### Task 1 – Implementing the Stack ADT
- `Stack<T>` interface defines `push`, `pop`, `peek`, `isEmpty` and `size`.
- `ArrayStack<T>` is an array-backed implementation that grows automatically.
- Tests check that after `push(10)`, `push(20)`, `push(30)`, `pop()` returns `30` (LIFO), that size is tracked, and that popping an empty stack throws `EmptyStackException`.

### Task 2 – Data Encapsulation
- `Student` has private fields `id`, `name` and `cgpa`, exposed only through `getId()`, `getName()` and `getCgpa()`.
- `EncapsulationDemo` is a separate class showing that direct access such as `s.id = 5;` causes a compile error.

### Task 3 – Programming to an Abstraction
- A single `List<String>` variable is first assigned an `ArrayList` and then a `LinkedList`.
- This shows that client code depends on the interface, not on a concrete implementation.

### Task 4 – Library System ADT Design
- `LibrarySystem` interface defines `addBook`, `removeBook`, `searchBook`, `issueBook` and `returnBook`.
- `Book` holds the data: book ID, title, author and issued status.
- `LibraryImplementation` stores books in a `HashMap` keyed by book ID.

### Task 5 – Student Management System
- `StudentCollection` interface defines `addStudent`, `removeStudent`, `findStudent`, `getSize` and `isEmpty`.
- `StudentCollectionImplementation` is backed by an `ArrayList`.
- JUnit tests validate every operation.

## Project Structure
