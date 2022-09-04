import java.util.HashMap;
import java.util.HashSet;

public class Algorithms {

    public static void main(String[] args) {
        
        Employee employee = new Employee("Robby", 3827,
                "Technology");
        Employee employee2 = new Employee("Bobby", 9612,
                "Marketing");
        Employee employee3 = new Employee("Sally", 2519,
                "Sales");
        
        HashMap<Integer, Employee> employeesById = new HashMap<>();
        employeesById.put(employee.id, employee);
        employeesById.put(employee2.id, employee2);
        employeesById.put(employee3.id, employee3);

        System.out.println(employeesById.get(3827));

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("2T26B");
        productCodes.add("9F3NJ");
        productCodes.add("FD9SJ");

        System.out.println(productCodes.contains("FD9SJ"));
        System.out.println(productCodes.contains("FSSI5"));

        

    }
}
