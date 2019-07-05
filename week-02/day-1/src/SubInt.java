import java.util.ArrayList;

public class SubInt {

    public static void main(String[] args) {

        System.out.println(subInt(1, new int[] {1, 11, 34, 61, 21}));

    }

    public static ArrayList<Integer> subInt (int number, int[] numbers) {
        String[] strnumbers = new String[numbers.length];
        String strnumber = Integer.toString(number);
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            strnumbers[i] = String.valueOf(numbers[i]);

            if (strnumbers[i].contains(strnumber)) {
                indexes.add(findIndex(strnumbers[i], strnumbers));
            }
        }
        return indexes;
    }

    public static int findIndex (String element, String[] strArray) {
        for (int j = 0; j < strArray.length; j++) {
            if (strArray[j] == element){
                return j;
            }
        }
        return -1;
    }
}

