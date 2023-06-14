package category.Bird.Waterfowl;

import category.Bird.Bird;
import category.Bird.BirdType;
import category.Bird.WaterBird;
import category.Food.Food;
import category.WaterSource.WaterSource;

import java.util.EnumSet;

/**
 * Represents a waterfowl, a bird that lives near water sources.
 */
public abstract class Waterfowl extends Bird  implements WaterBird {
    EnumSet<WaterSource> bodyOfWater;
    /**
     * Creates a new waterfowl.
     * @param foodSet The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Waterfowl(EnumSet<Food> foodSet, BirdType type) {
        super("Live near water sources (fresh or salt)", 2, foodSet, type);
        this.bodyOfWater = EnumSet.of(WaterSource.FRESH, WaterSource.SALT);
    }

    /**
     * Returns the type of water this bird lives near.
     * @return The type of water this bird lives near.
     */
      public  EnumSet<WaterSource> getTypeOfWater() {
            return this.bodyOfWater;
        }

}
