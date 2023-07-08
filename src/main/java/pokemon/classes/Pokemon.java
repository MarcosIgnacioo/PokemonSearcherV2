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
    private Stats stats;

    public Pokemon(String name, int id, int height, int weight, int baseExperience, int order, boolean isDefault, List<TypePokemon> types, Stats stats) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.order = order;
        this.isDefault = isDefault;
        this.types = types;
        this.stats = stats;
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

    public List<TypePokemon> getTypes() {
        return types;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        StringBuilder pkmnTypes = new StringBuilder();
        for (TypePokemon t:
             types) {
            pkmnTypes.append(t.toString());
        }
        int spaces = Math.max(name.length(), pkmnTypes.length());
        StringBuilder spacesToString = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            spacesToString.append("_");
        }
        return  "POKEMON         : "+ name + "\n"+
                "ID              : "+ id + "\n"+
                "HEIGHT          : "+ height + "\n"+
                "WEIGHT          : "+ weight + "\n"+
                "BASE EXPERIENCE : "+ baseExperience + "\n" +
                "TYPES           : "+ pkmnTypes +  "\n" +
                "__________________"+ spacesToString +"\n"+
                "STATS \n"+ stats +  "\n";
    }
}
