package Weapon;

public enum Weapon {

    AXE(40, "one-handed"),
    GREATAXE(60, "two-handed"),
    SHORTSWORD(40, "one-handed"),
    LONGSWORD(50, "one-handed"),
    MORNINGSTAR(50, "one-handed"),
    CLAYMORE(60, "two-handed"),
    FLAMBERGE(70, "two-handed"),
    WARHAMMER(60, "two-handed"),
    EXCALIBUR(80, "one-handed");





    private final int damage;
    private final String weaponType;

    Weapon(int damage, String weaponType){
        this.damage = damage;
        this.weaponType = weaponType;
    }

    public int getWeaponDamage(){
        return this.damage;
    }

    public String getWeaponType(){
        return this.weaponType;
    }



}
