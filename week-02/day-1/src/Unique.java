import java.util.ArrayList;
import java.util.Arrays;

public class Unique {

    public static void main(String[] args) {

        System.out.println(subInt(new int[]{1, 11, 34, 11, 52, 1, 61, 34}));

    }

    public static ArrayList<Integer> subInt(int[] numbers) {
        ArrayList<Integer> indexes = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                indexes.add(numbers[i]);
            }
        }
        if (numbers[numbers.length - 1] != numbers[numbers.length - 2]) {
            indexes.add(numbers[numbers.length - 1]);
        }
        return indexes;
    }
}
