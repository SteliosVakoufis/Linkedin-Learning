public class Triangle {
    public static int numOfSides = 3;

    private double base,
        height,
        sideLenOne,
        sideLenTwo,
        sideLenThree;

    public Triangle(double base, double height, 
                    double sideLenOne, double sideLenTwo, 
                    double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }

}
