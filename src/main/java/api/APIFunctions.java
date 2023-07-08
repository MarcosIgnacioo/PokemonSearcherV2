package api;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import okhttp3.*;
import pokemon.classes.Pokemon;
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
        if (json.equals("Not found")) return Optional.of(new Pokemon("Not found", 0,0,0,0,0,false, List.of()));
        else{
            JSONObject jsonObject = new JSONObject(json);

            String pokemonName = jsonObject.getString("name");
            int pokemonId = jsonObject.getInt("id");
            int pokemonHeight = jsonObject.getInt("height");
            int pokemonWeight = jsonObject.getInt("weight");
            int pokemonBaseExp = jsonObject.getInt("base_experience");
            int pokemonOrder = jsonObject.getInt("order");
            boolean pokemonIsDefault = jsonObject.getBoolean("is_default");

            JSONArray types = jsonObject.getJSONArray("types");
            List<String> typesList = getTypes.apply(types);
            Pokemon pkmn = new Pokemon(pokemonName,pokemonId,pokemonHeight,pokemonWeight,pokemonBaseExp,pokemonOrder,pokemonIsDefault,typesList);

            return Optional.of(pkmn);
        }
    }
    static Function<JSONArray, List<String>> getTypes = jsonArray -> {
        List<String> typesList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject typeObject = jsonArray.getJSONObject(i).getJSONObject("type");
            String typeName = typeObject.getString("name");
            typesList.add(typeName);
        }
        return typesList;
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
