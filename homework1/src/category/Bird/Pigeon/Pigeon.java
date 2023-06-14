package category.Bird.Pigeon;

import category.Bird.Bird;
import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;
/**
 * Represents a pigeon, a bird.
 */
abstract class Pigeon extends Bird {
    /**
     * Creates a new pigeon.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Pigeon( EnumSet<Food> preferredFood, BirdType type) {
        super("Known for feeding their young 'bird milk' very similar to the milk of mammals", 2, preferredFood, type);
    }
}