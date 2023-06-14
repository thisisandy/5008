package category.Bird.Prey;
import category.Bird.Bird;
import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

//Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.
abstract public class Prey extends Bird {
    /**
     * Creates a new prey.
     * @param numberOfWings The number of wings of this bird.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Prey( int numberOfWings, EnumSet<Food> preferredFood, BirdType type) {
        super("Sharp, hooked beaks with visible nostrils", numberOfWings, preferredFood, type);
    }
}
