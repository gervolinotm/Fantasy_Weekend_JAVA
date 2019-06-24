package Player;

import Player.Melee.Barbarian;
import Weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;

    @Before
    public void before(){
        barbarian = new Barbarian("Dave");
        weapon = Weapon.EXCALIBUR;
    }

    @Test
    public void hasArmourDeBuff(){
        assertEquals(30, barbarian.getArmour());
    }

    @Test
    public void hasDamageBuff(){
        assertEquals(72, barbarian.dealDamage(), 0.01);
    }

}
