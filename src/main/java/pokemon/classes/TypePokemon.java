package pokemon.classes;

public class TypePokemon {
    int slot;
    String name;

    public TypePokemon(int slot, String name) {
        this.slot = slot;
        this.name = name;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " ";
    }
}
