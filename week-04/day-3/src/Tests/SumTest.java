package Tests;

import Workshop.Sum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SumTest {
    Sum numbersSum;

    @BeforeEach
    public void setup(){
        numbersSum = new Sum();
    }


    @Test
    public void sumTheList(){
        ArrayList<Integer> example = new ArrayList<>();
        example.add(4);
        example.add(5);
        example.add(6);
        assertEquals(15, numbersSum.sum(example));
    }


    @Test
    public void sumTheEmptyList(){
        ArrayList<Integer> example = new ArrayList<>();
        assertEquals(0, numbersSum.sum(example));
    }

    @Test
    public void sumOneElementTheList(){
        ArrayList<Integer> example = new ArrayList<>();
        example.add(5);
        assertEquals(5, numbersSum.sum(example));
    }
    @Test
    public void sumNullElementTheList(){
        assertEquals(0, numbersSum.sum(null));
    }


}
