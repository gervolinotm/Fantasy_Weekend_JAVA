package Player;

public abstract class Player {

    protected String name;
    protected int maxHP;
    protected int currentHP;


    protected Player(String name, int maxHP) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    public String getName(){
        return this.name;
    }

    public int getMaxHP(){
        return this.maxHP;
    }

    public int getCurrentHP(){
        return this.currentHP;
    }
}
