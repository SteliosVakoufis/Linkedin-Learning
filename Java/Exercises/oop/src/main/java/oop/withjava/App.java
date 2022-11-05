package oop.withjava;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        BetterArrayList myArr = new BetterArrayList();
        myArr.add(10);
        myArr.add(60);
        myArr.add(30);
        myArr.add(20);

        myArr.forEach(val -> System.out.println(val));
        System.out.println();

        System.out.println(myArr.pop());
        System.out.println();

        myArr.forEach(val -> System.out.println(val));
        System.out.println();
    }
}
