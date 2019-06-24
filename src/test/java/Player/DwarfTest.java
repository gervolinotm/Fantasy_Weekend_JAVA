package Player;

import Player.Melee.Dwarf;
import Weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon weapon1;

    @Before
    public void before(){
        dwarf = new Dwarf("Glin'Lok");
        weapon1 = Weapon.WARHAMMER;
    }

    @Test
    public void hasName(){
        assertEquals("Glin'Lok", dwarf.getName());
    }

    @Test
    public void hasMaxHP(){
        assertEquals(150, dwarf.getMaxHP());
    }

    @Test
    public void currentHPShouldStartEqualToMaxHP(){
        assertEquals(150, dwarf.getCurrentHP());
    }

    @Test
    public void hasArmour(){
        assertEquals(50, dwarf.getArmour());
    }

    @Test
    public void weaponInventoryStartsEmpty(){
        assertEquals(0, dwarf.getNumOfWeapons());
    }

    @Test
    public void canAddWeaponToWeaponInventory(){
        dwarf.pickUpWeapon(weapon1);
        assertEquals(1, dwarf.getNumOfWeapons());
    }

    @Test
    public void dwarfHasDeBuffOnWeaponDamage(){
        assertEquals(48, dwarf.dealDamage(), 0.01);
    }

    @Test
    public void dwarfHasGreatAxeAsStartingActiveWeapon(){
        assertEquals(Weapon.GREATAXE, dwarf.getActiveWeapon());
    }

    @Test
    public void dwarfCanSwitchActiveWeapon(){
        dwarf.pickUpWeapon(weapon1);
        dwarf.switchActiveWeapon(weapon1);
        assertEquals(1, dwarf.getNumOfWeapons());
        assertEquals(weapon1, dwarf.getActiveWeapon());
    }

    @Test
    public void dwarfCannotSwitchActiveWeaponIfWeaponIsNotInWeaponInventory(){
        dwarf.switchActiveWeapon(weapon1);
        assertEquals(0, dwarf.getNumOfWeapons());
        assertEquals(Weapon.GREATAXE, dwarf.getActiveWeapon());
    }


}
