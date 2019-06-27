import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();

        }
    }
}
