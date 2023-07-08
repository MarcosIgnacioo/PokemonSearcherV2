package pokemon.classes;

import java.util.List;

public class Pokemon {
    private final String name;
    private final int id;
    private final int height;
    private final int weight;
    private final int baseExperience;
    private final int order;
    private final boolean isDefault;
    private final List<TypePokemon> types;

    public Pokemon(String name, int id, int height, int weight, int baseExperience, int order, boolean isDefault, List<TypePokemon> types) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.order = order;
        this.isDefault = isDefault;
        this.types = types;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public int getOrder() {
        return order;
    }

    public boolean isDefault() {
        return isDefault;
    }


    @Override
    public String toString() {
        StringBuilder pkmnTypes = new StringBuilder();
        for (TypePokemon t:
             types) {
            pkmnTypes.append("[");
            pkmnTypes.append(t.getName());
            pkmnTypes.append("] ");
        }
        return  "Pokemon: "+ name + "\n"+
                "id: "+ id + "\n"+
                "height: "+ height + "\n"+
                "weight: "+ weight + "\n"+
                "base experience: "+ baseExperience + "\n" +
                "Types: "+ pkmnTypes +  "\n";
    }
}
