public class Algorithms {

    public static String reverseEachWord(String s) {
        if (s == null || s == "") return s;
        StringBuilder result = new StringBuilder();
        String[] WordsArray = s.split("\\s+");

        for (int i = 0; i < WordsArray.length; i++) {
            result.append(reverse(WordsArray[i]));
            if (i != WordsArray.length - 1) result.append(" "); 
        }

        return result.toString().trim();
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}
