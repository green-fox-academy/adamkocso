import java.util.ArrayList;
import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    }


    public static ArrayList<Integer> bubble(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numberList.add(numbers[i]);
        }
        return numberList;
    }

    public static ArrayList<Integer> advancedBubble(int[] list, boolean bool) {
        if (bool) {
            Arrays.sort(list);
            ArrayList<Integer> reverse = new ArrayList<>();
            for (int i = list.length - 1; i >= 0; i--) {
                reverse.add(list[i]);
            }
            return reverse;
        }
        return bubble(list);
    }
}