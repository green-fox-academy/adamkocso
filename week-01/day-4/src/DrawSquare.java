import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            System.out.printf("#");
        }
        System.out.println();

        for (int j = 1; j <= row - 2; j++) {
            System.out.printf("#");
            for (int k = 1; k <= row - 2; k++) {
                System.out.printf(" ");
            }
            System.out.printf("#");
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            System.out.printf("#");

        }
    }
}
