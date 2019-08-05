package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> pirates;

    public Ship() {
       pirates = new ArrayList<>();
    }

    public void fillShip(Pirate pirate){
        if(pirate.captain){
            if(!pirates.contains(pirate.captain)) {
                pirates.add(pirate);
            }
        }

        if(pirates.size() < 2) {
            int n = (int) (Math.random() * 10 + 10);
            for (int i = 0; i < n; i++) {
                pirates.add(new Pirate());
            }
        }

    }

    public String captainInfo(){
        String aboutCaptain = "";
        for (int i = 0; i < pirates.size(); i++) {
            if(pirates.get(i).captain && pirates.get(i).passedOut && !pirates.get(i).dead){
                aboutCaptain = "The captain drunk: " + pirates.get(i).consumedRum + " rum and he is passed out!";
            } else if (pirates.get(i).captain && pirates.get(i).dead){
                aboutCaptain = "The captain drunk: " + pirates.get(i).consumedRum + " rum and he is dead!";
            } else if (pirates.get(i).captain){
                aboutCaptain = "The captain drunk: " + pirates.get(i).consumedRum + " rum and he is fine!";
            }
        }
        return aboutCaptain;
    }

    public String crewInfo(){
        int deadPiraters = 0;
        for (int i = 1; i < pirates.size(); i++) {
            if(pirates.get(i).dead){
                deadPiraters++;
            }
        }
        return pirates.size()-1 - deadPiraters + " Pirates are alive and " + deadPiraters + " are dead.";
    }

    public void battle(Ship otherShip){

    }
}
