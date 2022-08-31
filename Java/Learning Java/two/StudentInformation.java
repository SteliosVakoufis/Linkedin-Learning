public class StudentInformation {
    private int studentAge;
    private double studentGPA;
    private boolean hasPerfectAttendance;
    private String studentFirstName, studentLastName;
    private char studentFirstInitial, studentLastInitial;

    StudentInformation(int SA, double SGPA, boolean HPA, String SFN, String SLN){
        studentAge = SA;
        studentGPA = SGPA;
        hasPerfectAttendance = HPA;
        studentFirstName = SFN;
        studentLastName = SLN;
        studentFirstInitial = SFN.charAt(0);
        studentLastInitial = SLN.charAt(0);
    }

    public void changeStudentAge(int age){
        studentAge = age;
    }

    public void printInformation (){
        System.out.println("AGE: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        System.out.println("FInitial: " + studentFirstInitial);
        System.out.println("LInitial: " + studentLastInitial);
        System.out.println("Perfect Attendance: " + hasPerfectAttendance);
        System.out.println("First Name: " + studentFirstName);
        System.out.println("Last Name: " + studentLastName);
    }
}