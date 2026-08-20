/*
 * Week 6 - Employee and Lecturer
 * Employee is the parent class. Every employee has an ID and a name.
 */
public class Employee {

    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
    }
}
