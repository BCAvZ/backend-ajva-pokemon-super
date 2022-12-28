public class ElectricPokemon extends Pokemon {

    private int special;
    private String superEffectiveOn;



    public ElectricPokemon(String name, String food, int special, String superEffectiveOn) {
        super(name, food);

        this.special = special;
        this.superEffectiveOn = superEffectiveOn;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public String getSuperEffectiveOn() {
        return superEffectiveOn;
    }

    public void setSuperEffectiveOn(String superEffectiveOn) {
        this.superEffectiveOn = superEffectiveOn;
    }

    @Override
    public void typeWeakness() {
        System.out.println("Electric is weak to ground!");
    }


}
