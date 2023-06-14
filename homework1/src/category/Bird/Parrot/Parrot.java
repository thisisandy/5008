package category.Bird.Parrot;
import category.Bird.Bird;
import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

//Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds. Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.  They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
/**
 * Represents a parrot, a bird known for its intelligence and ability to mimic sounds.
 */
abstract public class Parrot extends Bird {
    int vocabularySize;
    String favoriteSaying;
    /**
     * Creates a new parrot.
     * @param vocabularySize The size of the vocabulary of this parrot.
     * @param favoriteSaying The favorite saying of this parrot.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Parrot(int vocabularySize, String favoriteSaying, EnumSet<Food> preferredFood, BirdType type) {
        super("Short, curved beak", 2, preferredFood, type);
        this.vocabularySize = vocabularySize;
        this.favoriteSaying = favoriteSaying;
    }
    // specific characteristics for Parrots...
}
