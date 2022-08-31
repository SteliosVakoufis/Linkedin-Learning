import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        StudentInformation s1 = new StudentInformation(
            15, 
            3.14, 
            true, 
            "Kayla", 
            "Hammon"
        );

        s1.printInformation();

        try (Scanner input = new Scanner(System.in)) {
            s1.changeStudentAge(input.nextInt());
        }
        catch (Exception e) {
            System.out.println("Please provide the correct input.");
        }

        s1.printInformation();

    }
}
