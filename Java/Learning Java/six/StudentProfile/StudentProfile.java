public class StudentProfile {
    private String firstName, lastName, deMayor;
    private int[] expGDay;
    private double sGPA;

    StudentProfile(String firstName, String lastName, 
                   int[] expGDay, String deMayor, 
                   double sGPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expGDay = expGDay;
        this.deMayor = deMayor;
        this.sGPA = sGPA;
    }

    public void information(){
        System.out.println(
            "--Student Information--" + 
            "\nFirst name: " + this.firstName +
            "\nLast name: " + this.lastName +
            "\nExpected Graduation Day: " +
                this.expGDay[0] + " / " +
                this.expGDay[1] + " / " +
                this.expGDay[2] + " (DD/MM/YYYY)" +
            "\nDeclared Mayor: " + this.deMayor + 
            "\nStudent GPA: " + this.sGPA
        ); 
    }

    public void extendGDay(){
        this.expGDay[2] += 1;
    }

    public void extendGDay(int amount){
        this.expGDay[2] += amount;
    }

}