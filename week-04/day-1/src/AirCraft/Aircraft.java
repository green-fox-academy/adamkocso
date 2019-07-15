package AirCraft;

public class Aircraft {

    int ammoStorage;
    int maxAmmo;
    int baseDamage;



    public Aircraft(int ammoStorage, int maxAmmo, int baseDamage) {
        this.ammoStorage = ammoStorage;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public void setAmmoStorage(int ammoStorage) {
        this.ammoStorage = ammoStorage;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int fight(){
        int damage = ammoStorage * baseDamage;
        setAmmoStorage(0);
        return damage;
    }

    public int refill (int ammo){
        int actualAmmo = getAmmoStorage();
        if(getMaxAmmo() < ammo || getMaxAmmo() - getAmmoStorage() < ammo){
            setAmmoStorage(getMaxAmmo());
        } else if (getMaxAmmo() - getAmmoStorage() > ammo){
            setAmmoStorage(getAmmoStorage() + ammo);
        }
        return ammo - (getAmmoStorage() - actualAmmo);
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String getStatus(){
        return "Type " + getType() + ", " + "Ammo: " +
                "" + getAmmoStorage() + ", " + "Base Damage: " + getBaseDamage() + ", " + "All Damage: " + getAmmoStorage() * getBaseDamage();
    }
}
