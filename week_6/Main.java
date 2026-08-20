/*
 * Week 6 (main programme)
 */
public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("L100", "Dr Ahmad",
                "Java Programming", "Faculty of Information Technology");

        // displayInfo() is inherited from Employee
        lecturer.displayInfo();
        lecturer.displaySubject();
        lecturer.displayDepartment();
    }
}
