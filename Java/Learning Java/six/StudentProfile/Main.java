public class Main {
    public static void main(String[] args) {
        StudentProfile s1 = new StudentProfile(
            "nathan",
            "Fielder",
            new int[]{14, 8, 1999},
            "Economics",
            1.4
        );
        
        s1.information();
        s1.extendGDay(2);
        s1.information();

    }
}