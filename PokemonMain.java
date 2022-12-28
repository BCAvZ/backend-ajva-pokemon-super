public class PokemonMain {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Pechu berry", 250, "Water and Air");
        pikachu.eating();
        pikachu.speaks();

        System.out.println(pikachu);

        Pokemon raichu = new ElectricPokemon("Raichu", "Pechu berry",500, "Water and air");
        raichu.speaks();

        Pokemon totodile = new WaterPokemon("totodile", "??? berry", 200, 50);
        totodile.typeWeakness();

        FirePokemon charmander = new FirePokemon("charmander", "enigma berry", "five inches", 1);
        charmander.fireLash();

        GrassPokemon bulbasaur = new GrassPokemon("bulbasaur", "another berry", 5, 1);
        bulbasaur.eating();




    }
}
