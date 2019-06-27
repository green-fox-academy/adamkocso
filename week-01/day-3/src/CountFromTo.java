import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger!");
        }
        else {
            while (number1 < number2) {
                System.out.println(number1);
                number1 += 1;
            }

        }
    }
}
