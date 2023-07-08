package pokemon.classes;

import java.util.List;

public class Pokemon {
    private String name;
    private int id;
    private int height;
    private int weight;
    private int baseExperience;
    private int order;
    private boolean isDefault;
    private List<String> tipos;

    public Pokemon(String name, int id, int height, int weight, int baseExperience, int order, boolean isDefault, List<String> tipos) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.order = order;
        this.isDefault = isDefault;
        this.tipos = tipos;
    }

    public Pokemon() {
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
        StringBuilder tmp = new StringBuilder();
        for (String pokemonType:
             tipos) {
            tmp.append(pokemonType);
            tmp.append(" ");
        }
        return  "Pokemon: "+ name + "\n"+
                "id: "+ id + "\n"+
                "height: "+ height + "\n"+
                "weight: "+ weight + "\n"+
                "base experience: "+ baseExperience + "\n" +
                "Tipos: "+ tmp +  "\n";
    }
}
