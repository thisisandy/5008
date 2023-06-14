package category.Bird.ShoreBird;


import category.Bird.Bird;
import category.Bird.BirdType;
import category.Bird.WaterBird;
import category.Food.Food;
import category.WaterSource.WaterSource;

import java.util.EnumSet;
/**
 * Represents a shorebird, a bird that lives near water sources.
 */
abstract class Shorebird extends Bird implements WaterBird {
    EnumSet<WaterSource> bodyOfWater;
    /**
     * Creates a new shorebird.
     * @param food The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Shorebird(EnumSet<Food> food, BirdType type) {
        super("Live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean", 2, food, type);
        this.bodyOfWater = EnumSet.of(WaterSource.SALT, WaterSource.OCEAN, WaterSource.WETLAND, WaterSource.FRESH, WaterSource.SALTWATER_SHORELANDS);
    }
    // specific characteristics for Shorebirds...
    /**
     * Returns the type of water this bird lives near.
     * @return The type of water this bird lives near.
     */
    public EnumSet<WaterSource> getTypeOfWater() {
        return this.bodyOfWater;
    }
}

