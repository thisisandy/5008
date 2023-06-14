package category.Bird.Waterfowl;

import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

/**
 * Represents a duck, a waterfowl.
 */
public class Duck extends Waterfowl{
    /**
     * Creates a new duck.
     */
    public Duck() {
        super( EnumSet.of(Food.FISH),  BirdType.DUCK);
    }
}
