package PetrolStation;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car(40, 100);
        System.out.println("Bmw gas amount: " + bmw.gasAmount + " Bmw capacity: " + bmw.capacity);

        Station shell = new Station();

        shell.refill(bmw);

        System.out.println("Bmw gas amount: " + bmw.gasAmount);
        System.out.println("Station gas amount: " + shell.gasAmount);





    }


}
