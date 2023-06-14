package category.Bird.Parrot;

import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

/**
 * Represents a RoseRingParakeet, a parrot native to Africa and Asia.
 */
public class RoseRingParakeet extends Parrot {
    static BirdType type = BirdType.ROSE_RING_PARAKEET;
    /**
     * Creates a new RoseRingParakeet.
     * @param vocabularySize The size of the vocabulary of this parrot.
     * @param favoriteSaying The favorite saying of this parrot.
     * @param preferredFood The preferred food of this bird.
     */
    public RoseRingParakeet(int vocabularySize, String favoriteSaying, EnumSet<Food> preferredFood) {
        super(vocabularySize, favoriteSaying, preferredFood, type);
    }
}
