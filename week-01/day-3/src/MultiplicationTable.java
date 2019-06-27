import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = sc.nextInt();

        for (int a = 1; a <= 10; a++){
            System.out.println(a + " * " + number + " = " + a * number);
        }
    }
}
