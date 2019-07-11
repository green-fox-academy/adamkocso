package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals;
    int slots;


    public Farm (int slots) {
        this.animals = new ArrayList<>();
        this.slots = slots;
    }

    public void add(Animal animal){
        animals.add(animal);
    }

    public void breed(Animal animal){
        if (animals.size() < slots) {
            animals.add(animal);
        }
    }

    public void slaughter(){
        int minHunger = animals.get(0).hunger;
        int minIndex = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < minHunger) {
                minHunger = animals.get(i).hunger;
                minIndex = i;
            }
        }
        animals.remove(minIndex);
    }
}
