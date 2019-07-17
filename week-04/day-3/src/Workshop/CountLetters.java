package Workshop;

import java.util.HashMap;

public class CountLetters {


    public HashMap<Character, Integer> dictionary(String word){
        char[] letters = word.toCharArray();
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            if (dictionary.containsKey(letters[i])){
                dictionary.put(letters[i], dictionary.get(letters[i]) + 1);
            } else {
                dictionary.put(letters[i], 1);
            }
        }
        return dictionary;
    }
}
