package Player.Melee;

import Behaviour.IDealDamage;
import Weapon.Weapon;

public class Knight extends Melee implements IDealDamage {

    public Knight(String name){
        super(name);
        this.maxHP -= 40;
        this.currentHP = maxHP;
        this.armour += 30;
        this.activeWeapon = Weapon.SHORTSWORD;
    }

    public double dealDamage(){
        return this.activeWeapon.getWeaponDamage();
    }

}
