package api;

public class APIPokemon {
    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    MediaType mediaType = MediaType.parse("text/plain");
    RequestBody body = RequestBody.create(mediaType, "");
    Request request = new Request.Builder()
            .url("https://pokeapi.co/api/v2/pokemon")
            .method("GET", body)
            .build();
    Response response = client.newCall(request).execute();
}
