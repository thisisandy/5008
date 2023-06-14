package category.Conservatory;
import category.Aviary.Aviary;
import category.Aviary.AviaryRule;
import category.Bird.Bird;
import category.Extinguish.ExtinguishBirdManager;
import category.Food.FoodManager;
import java.util.*;

/**
 * Manages multiple aviaries and the rescue and care of birds.
 */
public class Conservatory {
    private final List<Aviary> aviaries;
    public static final int maxAviaries = 20;
    private final List<Bird> birds;
    private static final ExtinguishBirdManager _extinguishBirdManager_ = ExtinguishBirdManager.getInstance();
    private final FoodManager foodManager = new FoodManager();

    /**
     * Creates a new Conservatory.
     */
    public Conservatory() {
        this.aviaries = new ArrayList<>();
        this.birds = new ArrayList<>();
    }

    /**
     * Attempts to rescue the given bird by placing it in a compatible aviary. If no compatible aviary is found, a new aviary is created for the bird.
     * @param bird The bird to rescue.
     * @return True if the bird was rescued, false otherwise.
     */
    public boolean rescueBird(Bird bird) {
        birds.add(bird);
        if (!_extinguishBirdManager_.isExtinguishBird(bird)) {
            for (Aviary aviary : aviaries) {
                if (AviaryRule.canRescueBird(aviary, bird)) {
                    aviary.addBird(bird);
                    foodManager.addFood(bird);
                    return true;
                }
            }
            if (aviaries.size() < maxAviaries) {
                Aviary aviary = new Aviary();
                aviary.addBird(bird);
                aviaries.add(aviary);
                foodManager.addFood(bird);
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the total number of birds in this conservatory.
     * @return The total number of birds.
     */
    public int getNumberOfBirds() {
        return birds.size();
    }

    /**
     * Gets the total number of aviaries in this conservatory.
     * @return The total number of aviaries.
     */
    public int getNumberOfAviaries() {
        return aviaries.size();
    }

    /**
     * Gets the aviary that contains the given bird.
     * @param bird The bird whose aviary is being retrieved.
     * @return The aviary containing the bird, or null if no aviary contains the bird.
     */
    public Aviary getAviaryOfBird(Bird bird) {
        for (Aviary aviary : aviaries) {
            if (aviary.getBirds().contains(bird)) {
                return aviary;
            }
        }
        return null;
    }

    /**
     * Generates a listing of all aviaries and the birds they contain.
     * @return A listing of aviaries and birds.
     */
    public String listAviaries() {
        // Print a “map” that lists all the aviaries by location and the birds they house
        // aviary1: bird1, bird2, bird3
        // aviary2: bird4, bird5
        StringBuilder sb = new StringBuilder();
        for (Aviary aviary : aviaries) {
            sb.append(aviary.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Generates an alphabetical index of all birds and the aviaries they are located in.
     * @return An alphabetical index of birds and aviaries.
     */
    public String listBirds() {
        // Print an index that lists all birds in the conservatory in alphabetical order and their location
        // Sort birds based on name
        birds.sort(Comparator.comparing(Bird::getType));

        // Map that lists all birds in the conservatory in alphabetical order and their location
        Map<String, String> birdsWithAviaries = new HashMap<>();
        for (Bird bird : birds) {
            Aviary aviary = getAviaryOfBird(bird);
            birdsWithAviaries.put(bird.getType().toString(),
                    aviary != null ? aviary.getLocation() : "No Aviary");
        }
        return birdsWithAviaries.toString();
    }
}