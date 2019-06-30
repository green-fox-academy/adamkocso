import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many number would you like to give?");
        int number = sc.nextInt();
        int sum = 0;
        int numbers = 0;

        System.out.println("Please enter your numbers:");
        for (int i = 0; i < number; i++) {
            numbers = sc.nextInt();
            sum += numbers;
        }

        double average = (double) sum / number;
        System.out.println("Sum: " + sum + ", " + "Average: " + average);




    }

}
