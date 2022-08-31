public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(
            15, 
            8, 
            15, 
            8, 
            17
        );
        Triangle t2 = new Triangle(
            3, 
            2.598, 
            3, 
            3, 
            3
        );
    
        double t1Area = t1.findArea();
        double t2Area = t2.findArea();

        System.out.println(t1Area);
        System.out.println(t2Area);

        

    }
}