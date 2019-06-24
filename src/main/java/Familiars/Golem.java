package Familiars;

import Spells.Spell;
import Weapon.Weapon;

public class Golem extends Familiar {

    protected int armour;
    protected String weakness;

    public Golem(String name){
        super(name, 100, 20);
        this.armour = 20;
        this.weakness = "psychic";
    }

    public int getFamiliarArmour(){
        return this.armour;
    }

    public String getWeakness(){
        return this.weakness;
    }

    public void damageTaken(Spell spell){
        if(this.getWeakness() == spell.getSpellType()){
            this.currentHP -= ((spell.getSpellDamage()) * 2);
        } else {
            this.currentHP -= spell.getSpellDamage();
        }
    }

    public void damageTaken(Weapon weapon){
        float damageAfterArmour = (weapon.getWeaponDamage() - this.getFamiliarArmour());
        this.currentHP -= damageAfterArmour;
    }


}
