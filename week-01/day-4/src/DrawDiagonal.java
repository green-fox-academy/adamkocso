import java.util.Scanner;

public class DrawDiagonal {

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
            for (int k = 1; k < j; k++){
                System.out.printf(" ");
            }
            System.out.printf("#");
            for (int l = 1; l <= row - 2 - j; l++) {
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

