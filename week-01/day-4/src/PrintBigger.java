import javafx.scene.Scene;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write down your first number: ");
        int first = sc.nextInt();

        System.out.println("Write down your first number: ");
        int second = sc.nextInt();


        if (first > second) {
            System.out.println("The bigger number is: " + first);
        }
        else {
            System.out.println("The bigger number is: " + second);
        }

    }
}
