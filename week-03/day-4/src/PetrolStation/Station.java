package PetrolStation;

public class Station {

    int gasAmount = 1000;

    Station(){}

    public void refill(Car car){
        gasAmount = gasAmount - (car.capacity - car.gasAmount);
        car.gasAmount = car.capacity;

    }

}
