public class GrassPokemon extends Pokemon {
    private int xp;
    private int level;

    public GrassPokemon(String name, String food, int xp, int level){
        super(name, food);

        this.xp = xp;
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void typeWeakness() {
        System.out.println("Grass is weak to fire air and poison");
    }


}
