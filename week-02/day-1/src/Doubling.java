// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class Doubling {

    public static void main(String[] args) {

        int baseNum = 123;
        System.out.println(doubling(baseNum));
    }

    public static int doubling(int a) {
        return a * 2;
    }

}
