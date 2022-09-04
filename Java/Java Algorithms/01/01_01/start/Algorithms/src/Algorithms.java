public class Algorithms {

    public static boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("HeleLLo"));
        System.out.println(isUpperCase("HELLO"));

        System.out.println(isLowerCase("HeleLLo"));
        System.out.println(isLowerCase("hello"));
    }
}
