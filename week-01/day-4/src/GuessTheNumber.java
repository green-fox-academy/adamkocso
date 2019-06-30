import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storedNumber = 10;


        for (int i = 1; i > 0; i++) {

            System.out.println("Guess the number: ");
            int guess = sc.nextInt();

            if (guess < storedNumber) {
                System.out.println("The stored number is higher!");
            } else if (guess > storedNumber) {
                System.out.println("The stored number is lower!");
            } else {
                System.out.println("Your found the number: " + storedNumber);
                break;
            }
        }

    }
}
