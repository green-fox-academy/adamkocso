package Tests;

import Workshop.Apples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ApplesTest {
    Apples apple;

    @BeforeEach
    public void setup(){
        apple = new Apples();
    }

    @Test
    public void thisGiveApple(){
        assertEquals("apple", apple.getApple());
    }

    @Test
    public void thisNotGiveApple(){
        assertNotEquals("banana", apple.getApple());
    }

}
