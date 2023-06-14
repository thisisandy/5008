package category.Bird.Parrot;

import category.Bird.BirdType;

/**
 * Represents a sulfur crested cockatoo, a parrot native to Australia.
 */
public class SulfurCrestedCockatoo extends Parrot{
    /**
     * Creates a new sulfur crested cockatoo.
     * @param vocabularySize The size of the vocabulary of this parrot.
     * @param favoriteSaying The favorite saying of this parrot.
     */
    public SulfurCrestedCockatoo(int vocabularySize, String favoriteSaying) {
        super(vocabularySize, favoriteSaying, null, BirdType.SULFUR_CRESTED_COCKATOO);
    }
}
