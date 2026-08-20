/*
 * Week 1 - Getting Started
 * A simple programme that stores a student mark and prints the grade.
 */
public class StudentGrade {

    public static void main(String[] args) {
        // Student information
        String name = "Ali";
        int mark = 85;
        String grade;

        // Decide the grade from the mark
        if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Print the result
        System.out.println("=== Student Grade ===");
        System.out.println("Name  : " + name);
        System.out.println("Mark  : " + mark);
        System.out.println("Grade : " + grade);

        if (mark >= 50) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}
