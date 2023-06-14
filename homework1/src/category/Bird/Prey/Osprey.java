package category.Bird.Prey;

import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;
/**
 * Represents an osprey, a bird of prey.
 */
public class Osprey extends Prey{
    final BirdType type = BirdType.OSPREY;
    /**
     * Creates a new Osprey.
     */
    public Osprey() {
        super(2, EnumSet.of(Food.FISH), BirdType.OSPREY);
    }
}
