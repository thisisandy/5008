package category.Bird;
import category.Food.Food;
import java.util.EnumSet;
import java.util.List;

/**
 * Represents a generic bird. Specific types of birds should extend this class.
 */
public abstract class Bird implements IBird {
    protected BirdType type;
    String definingCharacteristic;
    int numberOfWings;
    EnumSet<Food> preferredFood;

    /**
     * Creates a new Bird.
     * @param definingCharacteristic A characteristic that defines this bird.
     * @param numberOfWings The number of wings this bird has.
     * @param preferredFood The types of food this bird prefers.
     * @param type The type of this bird.
     */
    // constructor
    public Bird(String definingCharacteristic, int numberOfWings, EnumSet<Food> preferredFood, BirdType type) {
        this.definingCharacteristic = definingCharacteristic;
        this.numberOfWings = numberOfWings;
        this.preferredFood = preferredFood;
        this.type = type;
    }

    /**
     * Gets the type of this bird.
     * @return The type of this bird.
     */
    public BirdType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.getType().toString();
    }

    /**
     * Gets a characteristic that defines this bird.
     * @return A characteristic that defines this bird.
     */
    public String getDefiningCharacteristic() {
        return definingCharacteristic;
    }

    /**
     * Gets the number of wings this bird has.
     * @return The number of wings this bird has.
     */
    public int getNumberOfWings() {
        return numberOfWings;
    }

    /**
     * Gets the types of food this bird prefers.
     * @return The types of food this bird prefers.
     */
    public List<String> getPreferredFood() {
        return null;
    }
}