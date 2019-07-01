// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class ReverseList {

    public static void main(String[] args) {

        int[] aj = {3, 4, 6, 5, 7};

        int[] bj = new int[aj.length];

        for (int j = 0; j < aj.length; j++) {
              bj[aj.length - 1 - j] = aj[j];
        }

        for (int i = 0; i < aj.length; i++) {
            aj[i] = bj[i];
        }

        System.out.println(Arrays.toString(aj));
    }
}
