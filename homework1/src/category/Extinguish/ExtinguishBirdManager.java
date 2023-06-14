package category.Extinguish;
import category.Bird.Bird;
import category.Bird.Flightless.Emus;
import category.Bird.Flightless.Kiwi;
import java.util.HashSet;
import java.util.Set;

/**
 * Manages birds that have become extinct.
 */
// This class is a singleton
public class ExtinguishBirdManager {
    private static ExtinguishBirdManager _instance_ = null;

    /**
     * Private constructor for singleton.
     */
    private ExtinguishBirdManager() {
        extinguishBirds = new HashSet<>();
    }

    /**
     * Gets the single instance of the ExtinguishBirdManager.
     * @return The single ExtinguishBirdManager instance.
     */
    public static ExtinguishBirdManager getInstance() {
        if (_instance_ == null) {
            _instance_ = new ExtinguishBirdManager();
            _instance_.addExtinguishBird(Kiwi.class);
            _instance_.addExtinguishBird(Emus.class);
        }
        return _instance_;
    }

    private final Set<Class<? extends Bird>> extinguishBirds;

    /**
     * Checks if the given bird is extinct.
     * @param bird The bird to check.
     * @return True if the bird is extinct, false otherwise.
     */
    public boolean isExtinguishBird(Bird bird) {
        return extinguishBirds.contains(bird.getClass());
    }

    /**
     * Adds an extinct bird type.
     * @param bird The extinct bird type to add.
     */
    public void addExtinguishBird(Class<? extends Bird> bird) {
        extinguishBirds.add(bird);
    }

    /**
     * Removes an extinct bird type.
     * @param bird The extinct bird type to remove.
     */
    public void removeExtinguishBird(Class<? extends Bird> bird) {
        extinguishBirds.remove(bird);
    }
}