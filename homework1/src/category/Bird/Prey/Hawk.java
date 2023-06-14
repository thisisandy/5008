package category.Bird.Prey;

import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;
/**
 * Represents a hawk, a bird of prey.
 */
public class Hawk extends Prey {
    /**
     * Creates a new hawk.
     */
    public Hawk(){
        super(2, EnumSet.of(Food.OTHER_BIRDS), BirdType.HAWK);
    }

}
