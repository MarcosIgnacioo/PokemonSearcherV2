package api;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import okhttp3.*;
import pokemon.classes.Pokemon;
import pokemon.classes.Stats;
import pokemon.classes.TypePokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class APIFunctions {

    public static Optional<Pokemon> getPokemon(String pokemon) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/" + pokemon)
                .get()
                .build();
        Response response = client.newCall(request).execute();

        assert response.body() != null;


        String json = response.body().string();
        if (json.equals("Not found")) return Optional.of(new Pokemon("Not found", 0,0,0,0,0,false, List.of(), new Stats()));
        else{
            JSONObject jsonObject = new JSONObject(json);

            String pokemonName = jsonObject.getString("name");
            int pokemonId = jsonObject.getInt("id");
            int pokemonHeight = jsonObject.getInt("height");
            int pokemonWeight = jsonObject.getInt("weight");
            int pokemonBaseExp = jsonObject.getInt("base_experience");
            int pokemonOrder = jsonObject.getInt("order");
            boolean pokemonIsDefault = jsonObject.getBoolean("is_default");
            System.out.println(jsonObject.getJSONArray("stats"));

            JSONArray types = jsonObject.getJSONArray("types");
            JSONArray stats = jsonObject.getJSONArray("stats");
            List<TypePokemon> typesList = getTypes.apply(types);
            Stats statsPkmn = getStats.apply(stats);

            Pokemon pkmn = new Pokemon(pokemonName,pokemonId,pokemonHeight,pokemonWeight,pokemonBaseExp,pokemonOrder,pokemonIsDefault,typesList,statsPkmn);

            return Optional.of(pkmn);
            //return Optional.empty();
        }
    }
    static Function<JSONArray, List<TypePokemon>> getTypes = jsonArray -> {
        List<TypePokemon> typesList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject typeObject = jsonArray.getJSONObject(i).getJSONObject("type");
            TypePokemon typeName = new TypePokemon(i+1, typeObject.getString("name"));
            typesList.add(typeName);
        }
        return typesList;
    };


    static Function<JSONArray, Stats> getStats = jsonArray -> {
        List<Integer> statsNumbers = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            int statNumber = jsonArray.getJSONObject(i).getInt("base_stat");
            statsNumbers.add(statNumber);
        }
        return new Stats(statsNumbers);
    };

    /* funcion para buscar pokemon

    usar funciones de obtener los demas datos filtrados
    meter los datos filtrados a un Objeto pokemon
    returnearlo
     */

    /*funcion para obtener el nombre del pokemon*/
    /*funcion para obtener el tipo del pokemon*/
    /*funcion para obtener la localizacion del pokemon*/
}
