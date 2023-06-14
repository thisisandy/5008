package category.Bird;
import java.util.List;

/**
 * Represents the interface for a bird.
 */
interface IBird {

    /**
     * Gets the type of this bird.
     * @return The type of this bird.
     */
    BirdType getType();

    /**
     * Gets a characteristic that defines this bird.
     * @return A characteristic that defines this bird.
     */
    String getDefiningCharacteristic();

    /**
     * Gets the number of wings this bird has.
     * @return The number of wings this bird has.
     */
    int getNumberOfWings();

    /**
     * Gets the types of food this bird prefers.
     * @return The types of food this bird prefers.
     */
    List<String> getPreferredFood();
}