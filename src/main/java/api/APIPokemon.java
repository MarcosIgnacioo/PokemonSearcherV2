package api;

import okhttp3.*;

import java.io.IOException;
import java.util.Optional;

public class APIPokemon {


    public APIPokemon() throws IOException {

    }
    public Optional<String> getPokemon() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create("",mediaType);
        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/ditto")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        return Optional.of(response.body().string()).orElse("There is not pokemon put").describeConstable();
    }
}
