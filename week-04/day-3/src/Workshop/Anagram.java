package Workshop;

import java.util.Arrays;

public class Anagram {

    public boolean anagramCheck(String word1, String word2){
        if(word1 == null || word2 == null){
            return false;
        }
        char[] word1char = word1.toCharArray();
        char[] word2char = word2.toCharArray();
        Arrays.sort(word1char);
        Arrays.sort(word2char);
        String newWord1 = new String(word1char);
        String newWord2 = new String(word2char);
        return newWord1.equalsIgnoreCase(newWord2);
    }
}
