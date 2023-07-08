package cli;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class CLIPokemonArguments {

    @Parameter(names = "--name", description = "Nombre del Pokémon")
    private String name;

    @Parameter(names = "--location", description = "Locación del Pokémon")
    private String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CLIPokemonArguments{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
