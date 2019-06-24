package Player.Caster;

import Familiars.Familiar;
import Player.Player;
import Spells.Spell;

import java.util.ArrayList;

public abstract class Caster extends Player {

    protected ArrayList<Spell> spellBook;
    protected ArrayList<Familiar> summonPact;
    protected int spellSlots;
    protected Spell activeSpell;
    protected Familiar summonedFamiliar;

    public Caster(String name, int spellSlots){
        super(name, 50);
        this.currentHP = maxHP;
        this.spellBook = new ArrayList<Spell>();
        this.summonPact = new ArrayList<Familiar>();
        this.spellSlots = spellSlots;
        this.activeSpell = null;
        this.summonedFamiliar = null;
    }

    public void prepareSpell(Spell spell) {
        this.spellBook.add(spell);
    }

    public int getNumOfSpells() {
        return this.spellBook.size();
    }

    public void setActiveSpell(Spell spell) {
        int spellIndex = this.spellBook.indexOf(spell);
        this.activeSpell = this.spellBook.get(spellIndex);
    }

    public Spell getActiveSpell() {
        return this.activeSpell;
    }

    public void addFamiliar(Familiar familiar) {
        this.summonPact.add(familiar);
    }

    public int getNumOfFamiliars() {
        return this.summonPact.size();
    }

    public void summonFamiliar(Familiar familiar) {
        int familiarIndex = this.summonPact.indexOf(familiar);
        this.summonedFamiliar = this.summonPact.get(familiarIndex);
    }

    public Familiar getSummonedFamiliar() {
        return this.summonedFamiliar;
    }

    public double attack(){
        if(this.spellSlots != 0) {
            this.spellSlots -= 1;
            return this.activeSpell.getSpellDamage();
        } else {return 0;
        }

    }

    public int getNumOfSpellSLots() {
        return this.spellSlots;
    }


}
