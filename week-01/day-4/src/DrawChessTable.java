import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 > 0) {
                for (int j = 1; j <= number; j++) {
                    if (j % 2 > 0) {
                        System.out.printf("#");
                    }
                    else {
                        System.out.printf(" ");
                    }
                }
            }
            else {
                for (int k = 1; k <= number; k++){
                    if (k % 2 > 0) {
                        System.out.printf(" ");
                    }
                    else {
                        System.out.printf("#");
                    }

                }
            }

            System.out.println();

        }


    }

}
