import java.util.LinkedList;

public class Algorithms {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.add("Sally");
        myList.add("Beck");
        myList.add("Nick");
        myList.add("Jack");
        myList.add("Rachel");

        System.out.println(myList.contains("Nick"));
        System.out.println(myList.size());

        myList.forEach(item -> System.out.printf("%s", myList.getLast() == item ? item : item + " -> "));
    }
}
