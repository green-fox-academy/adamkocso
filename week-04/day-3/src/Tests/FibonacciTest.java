package Tests;

import Workshop.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    Fibonacci fibonacciNumbers = new Fibonacci();

    @Test
    public void getTheRightValue(){
        int expected = 8;
        assertEquals(expected, fibonacciNumbers.fibonacci(6));
    }

    @Test
    public void getAnotherRightValue(){
        int expected = 21;
        assertEquals(expected, fibonacciNumbers.fibonacci(8));
    }
}
