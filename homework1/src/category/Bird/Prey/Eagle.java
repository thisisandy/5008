package category.Bird.Prey;

import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

/**
 * Represents an eagle, a bird of prey.
 */
public class Eagle extends Prey {

    /**
     * Creates a new eagle.
     */
    public Eagle() {
        super(2, EnumSet.of(Food.OTHER_BIRDS), BirdType.EAGLE);
    }
}
