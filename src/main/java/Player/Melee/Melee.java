package Player.Melee;

import Weapon.Weapon;
import Player.Player;

import java.util.ArrayList;

public abstract class Melee extends Player {

    protected ArrayList<Weapon> weapons;
    protected int armour;
    protected Weapon activeWeapon;

    public Melee(String name){
        super(name, 100);
        this.armour = 50;
        this.weapons = new ArrayList<Weapon>();
        this.activeWeapon = null;
    }

    public int getArmour(){
        return this.armour;
    }


    public int getNumOfWeapons() {
        return this.weapons.size();
    }


    public void pickUpWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public Weapon getActiveWeapon() {
        return this.activeWeapon;
    }

    public void switchActiveWeapon(Weapon weapon){
        if(this.weapons.remove(weapon)){
            Weapon equippedWeapon = this.activeWeapon;
            this.weapons.add(equippedWeapon);
            this.weapons.remove(weapon);
            this.activeWeapon = weapon;
        }
    }
}
