// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Summing {

    public static void main(String[] args) {
        System.out.println(sum(2, 3, 4));

    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}
