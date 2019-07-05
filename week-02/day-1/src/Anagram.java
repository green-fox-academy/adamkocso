import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("god", "dog"));
    }


    public static boolean isAnagram (String strone, String strtwo) {
        strone.toLowerCase();
        strtwo.toLowerCase();
        String[] lettersOne = strone.split("");
        String[] lettersTwo = strtwo.split("");
        Arrays.sort(lettersOne);
        Arrays.sort(lettersTwo);
        ArrayList<String> lettersOneList = new ArrayList<>();
        ArrayList<String> lettersTwoList = new ArrayList<>();
        for (int i = 0; i < lettersOne.length; i++) {
            lettersOneList.add(lettersOne[i]);
        }
        for (int i = 0; i < lettersTwo.length; i++) {
            lettersTwoList.add(lettersTwo[i]);
        }
        return lettersOneList.equals(lettersTwoList);
    }

}
