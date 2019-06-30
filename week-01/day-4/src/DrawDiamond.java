import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row / 2; i++) {
            for (int j = row / 2; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        if (row % 2 > 0) {
            for(int l = 1; l <= row; l++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int m = row / 2; m > 0; m--) {
            for (int n = row / 2; n >= m; n--) {
                System.out.printf(" ");
            }
            for (int o = 0; o < m * 2 -1; o++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
