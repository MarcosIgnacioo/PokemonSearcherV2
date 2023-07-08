package pkmn.api;

import api.APIFunctions;
import api.APIPokemon;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

public class PokemonSearch {
    public static void main(String[] args) throws IOException {
        APIPokemon api = new APIPokemon();

        APIFunctions.getPokemon("swampert").ifPresent(System.out::println);
    }

}
