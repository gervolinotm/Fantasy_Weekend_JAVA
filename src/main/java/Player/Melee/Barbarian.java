package Player.Melee;

import Behaviour.IDealDamage;
import Weapon.Weapon;

public class Barbarian extends Melee implements IDealDamage {

    public Barbarian(String name){
        super(name);
        this.armour -= 20;
        this.activeWeapon = Weapon.CLAYMORE;
    }

    public double dealDamage(){
        return ((this.activeWeapon.getWeaponDamage()) * 1.2);
    }
}
