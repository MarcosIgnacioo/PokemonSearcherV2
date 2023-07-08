package pokemon.classes;

public class Ability {
    private final String name;
    private final int slot;
    private final boolean isHidden;

    // Constructor
    public Ability(String name, int slot, boolean isHidden) {
        this.name = name;
        this.slot = slot;
        this.isHidden = isHidden;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSlot() {
        return slot;
    }

    public boolean isHidden() {
        return isHidden;
    }
}
