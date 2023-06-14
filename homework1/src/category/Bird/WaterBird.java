package category.Bird;
import category.WaterSource.WaterSource;
import java.util.EnumSet;

/**
 * Represents a water bird, a bird that spends much of its time on or around water.
 */
public interface WaterBird {

    /**
     * Gets the types of water sources this bird frequents.
     * @return The types of water sources this bird frequents.
     */
    EnumSet<WaterSource> getTypeOfWater();
}