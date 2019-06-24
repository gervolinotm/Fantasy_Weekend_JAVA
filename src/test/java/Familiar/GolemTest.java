package Familiar;

import Familiars.Golem;
import Player.Melee.Dwarf;
import Spells.Spell;
import Weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GolemTest {

    Golem golem;
    Spell psychic;
    Spell nonPsychic;
    Dwarf dwarf;
    Weapon weapon;

    @Before
    public void before(){
        golem =  new Golem("Grunt");
        psychic = Spell.BRAINFREEZE;
        nonPsychic = Spell.FIREBALL;
        dwarf = new Dwarf("Gimli");
        weapon = Weapon.EXCALIBUR;
    }

    @Test
    public void hasName(){
        assertEquals("Grunt", golem.getFamiliarName());
    }

    @Test
    public void hasBaseDamage(){
        assertEquals(20, golem.getBaseDamage());
    }

    @Test
    public void hasArmour(){
        assertEquals(20, golem.getFamiliarArmour());
    }

    @Test
    public void hasMaxHPAndStartsWithMaxHP(){
        assertEquals(100, golem.getMaxHP());
        assertEquals(100, golem.getCurrentHP());
    }

    @Test
    public void canTakeMagicDamage(){
        golem.damageTaken(nonPsychic);
        assertEquals(70, golem.getCurrentHP());
    }

    @Test
    public void canTake2xMagicDamageDueToWeakness(){
        golem.damageTaken(psychic);
        assertEquals(40, golem.getCurrentHP());
    }

    @Test
    public void canTakeWeaponDamage(){
        golem.damageTaken(weapon);
        assertEquals(40, golem.getCurrentHP());
    }


}
