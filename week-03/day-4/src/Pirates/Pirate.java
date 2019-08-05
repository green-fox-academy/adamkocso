package Pirates;

public class Pirate {

    int consumedRum;
    boolean dead;
    boolean passedOut;
    boolean captain;

    public Pirate(){
    }

    public void drinkSomeRum(){
        if(!this.dead) {
            this.consumedRum++;
        } else {
            System.out.println("He's dead");
        }
    }

    public void isCaptain(){
        this.captain = true;
    }

    public void howsItGoingMate(){
        if(this.dead){
            System.out.println("He's dead");
        } else if (consumedRum < 5){
            for (int i = 0; i < (int)(Math.random() * 4 + 1) ; i++) {
                System.out.println("Pour me anudder!");
            }
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public void die(){
        this.dead = true;
    }

    public void brawl(Pirate targerPirate){
        if(this.dead){
            System.out.println("He's dead");
        } else if(targerPirate.dead){
            System.out.println("The target pirate is already dead");
        } else {
            int chance = (int)(Math.random() * 3);
            if(chance == 0){
                this.die();
            } else if (chance == 1){
                targerPirate.die();
            } else if (chance == 2){
                System.out.println("Both pirates pass out.");
                this.passedOut = true;
                targerPirate.passedOut = true;
            }
        }
    }
}
