package category.Bird.Flightless;

import category.Bird.BirdType;
/**
 * Represents a kiwi, a flightless bird native to New Zealand.
 */
public class Kiwi extends Flightless{
    /**
     * Creates a new Kiwi bird.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Kiwi() {
        super(null, BirdType.KIWI);
    }
}
