package Player.Melee;

import Behaviour.IDealDamage;
import Weapon.Weapon;

public class Dwarf extends Melee implements IDealDamage {


    public Dwarf(String name) {
        super(name);
        this.maxHP += 50;
        this.currentHP = maxHP;
        this.activeWeapon = Weapon.GREATAXE;
    }

    public double dealDamage(){
        return ((this.activeWeapon.getWeaponDamage()) * 0.8);
    }


}
