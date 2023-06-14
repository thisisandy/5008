package category.Bird.Owl;
//Owls are distinguished by the facial disks that frame the eyes and bill.

import category.Bird.Bird;
import category.Bird.BirdType;
import category.Food.Food;

import java.util.EnumSet;

/**
 * Represents an owl, a bird of prey.
 */
class Owl extends Bird {
    /**
     * Creates a new owl.
     * @param preferredFood The preferred food of this bird.
     * @param type The type of this bird.
     */
    public Owl(EnumSet<Food> preferredFood, BirdType type) {

        super("Facial disks that frame the eyes and bill", 2, preferredFood, type);
    }
    // specific characteristics for Owls...
}