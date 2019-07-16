package AirCraft;

import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircraft> storage;


    public Carrier (){
        storage = new ArrayList<>();
    }


    public void addStorage(Aircraft aircraft){
        storage.add(aircraft);
    }
}
