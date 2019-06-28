import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write 5 numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        int fifth = sc.nextInt();

        int sum = (first + second + third + fourth + fifth);
        double average = (double)(first + second + third + fourth + fifth) / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
