public class FirePokemon extends Pokemon {

    private String height;
    private int attack;

    public FirePokemon(String name, String food, String height, int attack){
        super(name, food);

        this.height = height;
        this.attack = attack;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void fireLash(){
        System.out.println(getName() + " uses fireLash!");
    }


    @Override
    public void typeWeakness() {
        System.out.println("Fire is weak to water and ground");
    }
}
