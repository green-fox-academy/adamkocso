import java.util.Scanner;

public class DivideByZero {

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number:");
        int divisor = sc.nextInt();
        divider(divisor);
    }

    public static void divider(int number) {
        try {
            int result = 10 / number;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("fail");
        }
    }
}
