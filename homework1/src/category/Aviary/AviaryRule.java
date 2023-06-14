package category.Aviary;

import category.Bird.Bird;
import category.Bird.Flightless.Flightless;
import category.Bird.Prey.Prey;
import category.Bird.Waterfowl.Waterfowl;

import java.util.ArrayList;

/**
 * Defines rules around rescuing birds and adding them to an aviary.
 */
public class AviaryRule {

    /**
     * Determines if the given bird can be rescued and added to the given aviary.
     * @param aviary The aviary the bird may be added to.
     * @param bird The bird being considered for rescue.
     * @return True if the bird can be rescued, false otherwise.
     */
    public static boolean canRescueBird(Aviary aviary, Bird bird) {
        return isCompatible(aviary, bird) && hasSpace(aviary);
    }

    /**
     * Checks if the aviary has enough space to add another bird.
     * @param aviary The aviary being checked.
     * @return True if the aviary can hold another bird, false otherwise.
     */
    private static boolean hasSpace(Aviary aviary) {
        return aviary.getBirds().size() < 5;
    }

    /**
     * Checks if the given bird is compatible with the birds already in the aviary. Birds are incompatible if:
     * - The new bird is prey and the aviary already contains predators
     * - The new bird cannot fly and the aviary already contains birds of prey
     * - The new bird is waterfowl and the aviary does not have access to a water feature
     *
     * @param aviary The aviary being checked.
     * @param bird The new bird being considered.
     * @return True if the new bird is compatible, false otherwise.
     */
    private static boolean isCompatible(Aviary aviary, Bird bird) {
        ArrayList<Class<? extends Bird>> conflictType = new ArrayList<>();
        conflictType.add(Prey.class);
        conflictType.add(Flightless.class);
        conflictType.add(Waterfowl.class);

        for (Bird aviaryBird : aviary.getBirds()) {
            for (Class<? extends Bird> type : conflictType) {
                if (type.isInstance(bird) && !type.isInstance(aviaryBird)) {
                    return false;
                }
            }
        }
        return true;
    }
}