package Tests;

import Workshop.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    Anagram anagram = new Anagram();


    @Test
    public void isAnagram(){
        String word1 = "GOD";
        String word2 = "DOG";
        assertTrue(anagram.anagramCheck(word1, word2));
    }

    @Test
    public void isNotAnagram(){
        assertFalse(anagram.anagramCheck("gold", "hello"));
    }

    @Test
    public void nullAnagram(){
        assertFalse(anagram.anagramCheck(null, "hello"));
    }
}
