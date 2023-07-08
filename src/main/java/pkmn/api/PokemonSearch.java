package pkmn.api;

import api.APIFunctions;
import java.io.IOException;

public class PokemonSearch {
    public static void main(String[] args) throws IOException {

        APIFunctions.getPokemon("swampert").ifPresent(System.out::println);
    }

}
