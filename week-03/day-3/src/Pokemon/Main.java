package Pokemon;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.


        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        System.out.println("A wild " + wildPokemon.name + " appeared!");

        System.out.print("I choose you, ");


        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
                System.out.println(pokemonOfAsh.get(i).name);
            }
        }








    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Bulbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikachu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}