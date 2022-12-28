public class WaterPokemon extends Pokemon {

    int accuracy;
    int hp;

    public WaterPokemon(String name, String food, int accuracy, int hp){
        super(name,food);

        this.accuracy = accuracy;
        this.hp = hp;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void typeWeakness() {
        System.out.println("Water is weak to electric");
    }
}
