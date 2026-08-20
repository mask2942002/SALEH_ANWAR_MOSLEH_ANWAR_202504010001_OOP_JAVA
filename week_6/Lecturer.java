/*
 * Week 6 - Employee and Lecturer
 * A lecturer is also an employee, but additionally teaches a subject.
 */
public class Lecturer extends Employee {

    private String subject;
    private String department;   // the extra variable added in Activity 2

    public Lecturer(String id, String name, String subject, String department) {
        super(id, name);         // the constructor of Employee is called first
        this.subject = subject;
        this.department = department;
    }

    public void displaySubject() {
        System.out.println("Subject     : " + subject);
    }

    public void displayDepartment() {
        System.out.println("Department  : " + department);
    }
}
