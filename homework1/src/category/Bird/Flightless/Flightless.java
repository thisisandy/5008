package category.Bird.Flightless;

import category.Bird.Bird;
import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;
/**
 * Represents a flightless bird.
 */
public abstract  class Flightless extends Bird {
    static final String defineCharacteristic = "Live on the ground and have no (or undeveloped) wings";
    /**
     * Creates a new flightless bird.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Flightless( EnumSet<Food> preferredFood, BirdType type) {
        super(defineCharacteristic, 2, preferredFood, type);
    }
}
