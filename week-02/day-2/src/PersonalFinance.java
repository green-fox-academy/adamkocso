import java.util.ArrayList;

public class PersonalFinance {

    public static void main(String[] args) {


        ArrayList<Integer> spendings = new ArrayList<>();

        spendings.add(500);
        spendings.add(1000);
        spendings.add(1250);
        spendings.add(175);
        spendings.add(800);
        spendings.add(120);


        System.out.println("Spent amount: " + totalSpendings(spendings));
        System.out.println("Greatest expense: " + greatesExpense(spendings));
        System.out.println("Cheapest spending: " + cheapestExpense(spendings));
        System.out.println("Average spendings: " + averageExpense(spendings));

    }

//  'How much did we spend?' funciton
    public static int totalSpendings(ArrayList<Integer> input) {
        int sum = 0;
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
            return sum;
        }

//  'Which was our greatest expense?' Function
    public static int greatesExpense(ArrayList<Integer> input) {
        int max = 0;
        for (int number : input) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

//  'Which was our cheapest spending?' Funciton
    public static int cheapestExpense(ArrayList<Integer> input) {
        if (input.isEmpty()){
            return 0;
        }
        int min = input.get(0);
        for (int number : input) {
            if (number < min){
                min = number;
            }
        }
        return min;
    }

//  'What was the average amount of our spendings?' Function
    public static int averageExpense(ArrayList<Integer> input) {
        int average = 0;
        average = totalSpendings(input) / input.size();

        return average;
    }

    }


