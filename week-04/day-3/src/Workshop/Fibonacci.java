package Workshop;

import java.util.ArrayList;

public class Fibonacci {

    public int fibonacci(int index){
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0,0);
        fibonacciNumbers.add(1,1);
        for (int i = 2; i < index + 1; i++) {
            fibonacciNumbers.add(i,fibonacciNumbers.get(i-1) + fibonacciNumbers.get(i-2));
        }
        return fibonacciNumbers.get(index);
    }
}
