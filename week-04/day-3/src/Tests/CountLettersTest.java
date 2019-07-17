package Tests;

import Workshop.CountLetters;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    CountLetters word = new CountLetters();

    @Test
    public void countLettersWork(){
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('l', 2);
        dictionary.put('o', 3);

        assertEquals(dictionary, word.dictionary("loool"));
    }
}
