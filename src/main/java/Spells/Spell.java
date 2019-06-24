package Spells;

public enum Spell {

    FIREBALL(30, "fire"),
    CHILLINGTOUCH(30, "ice"),
    LIGHTNINGBOLT(30, "lightning"),
    FLAME(20, "fire"),
    WATERSLICE(30, "water"),
    BRAINFREEZE(30, "psychic");

    private final int spellDamage;
    private final String spellType;

    Spell(int spellDamage, String spellType){
        this.spellDamage = spellDamage;
        this.spellType = spellType;
    }

    public int getSpellDamage(){
        return this.spellDamage;
    }

    public String getSpellType(){
        return this.spellType;
    }
}
