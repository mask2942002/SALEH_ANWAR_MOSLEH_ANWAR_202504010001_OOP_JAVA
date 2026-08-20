public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        // The private variables can only be changed through the setters
        student.setStudentID("CU12345");
        student.setName("Ali");
        student.setCGPA(3.75);
        student.setProgramme("BIT");

        // The private variables can only be read through the getters
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme  : " + student.getProgramme());
    }
}
