// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Arrays;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};


//        String swapper = abc [0];
//        abc [0] = abc [2];
//        abc [2] = swapper;
//
//        System.out.println(Arrays.toString(abc));


        Arrays.sort(abc, Collections.reverseOrder());

        System.out.println(Arrays.toString(abc));
    }
}
