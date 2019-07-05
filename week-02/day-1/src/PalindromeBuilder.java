public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(palindrome("hello"));
    }

    public static String palindrome (String words) {
    char [] letters = words.toCharArray();
    String reverse = words;
        for (int i = letters.length - 1; i >= 0; i--) {
            reverse += letters[i];
        }
        return reverse;
    }
}
