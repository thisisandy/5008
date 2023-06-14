package category.Bird.Parrot;

import category.Bird.BirdType;
/**
 * Represents a gray parrot, a parrot native to Africa.
 */
public class GrayParrot extends Parrot{
    static BirdType type = BirdType.GRAY_PARROT;
    /**
     * Creates a new gray parrot.
     * @param vocabularySize The size of the vocabulary of this parrot.
     * @param favoriteSaying The favorite saying of this parrot.
     */
    public GrayParrot(int vocabularySize, String favoriteSaying) {
        super(vocabularySize, favoriteSaying, null, type);
    }
}
