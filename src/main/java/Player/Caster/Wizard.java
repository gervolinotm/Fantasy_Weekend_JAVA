package Player.Caster;

import Behaviour.IDealMagicDamage;
import Familiars.Golem;
import Spells.Spell;

import java.util.ArrayList;
import java.util.Arrays;

public class Wizard extends Caster implements IDealMagicDamage {

    public Wizard(String name){
        super(name, 5);
        this.spellBook = new ArrayList<Spell>(Arrays.asList(Spell.FIREBALL, Spell.LIGHTNINGBOLT, Spell.WATERSLICE, Spell.WATERSLICE));
        this.activeSpell = Spell.FIREBALL;
        this.summonedFamiliar = new Golem("Grull");
    }

    public int dealMagicDamage(){
        return this.activeSpell.getSpellDamage();
    }
}
