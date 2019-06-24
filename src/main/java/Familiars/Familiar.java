package Familiars;

public abstract class Familiar {

    protected String name;
    protected int maxHP;
    protected int currentHP;
    protected int baseDamage;

    public Familiar(String name, int maxHP, int baseDamage){
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.baseDamage = baseDamage;
    }

    public String getFamiliarName(){
        return this.name;
    }

    public int getMaxHP(){
        return this.maxHP;
    }

    public int getCurrentHP(){
        return this.currentHP;
    }

    public int getBaseDamage(){
        return this.baseDamage;
    }

}
