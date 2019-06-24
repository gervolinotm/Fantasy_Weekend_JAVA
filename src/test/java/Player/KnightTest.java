package Player;

import Player.Melee.Knight;
import Weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        knight = new Knight("Sir Spamalot");
        weapon = Weapon.LONGSWORD;
    }

    @Test
    public void hasBuffedArmour(){
        assertEquals(80, knight.getArmour());
    }

    @Test
    public void hasDeBuffedStartingMaxHP(){
        assertEquals(60, knight.getMaxHP());
        assertEquals(60, knight.getCurrentHP());
    }
}
