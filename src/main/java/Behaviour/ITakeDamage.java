package Behaviour;

import Spells.Spell;
import Weapon.Weapon;

public interface ITakeDamage {

    int damageTaken(Spell spell);

    float damageTaken(Weapon weapon);
}
