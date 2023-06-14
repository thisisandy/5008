package category.Aviary;
import category.Bird.Bird;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an aviary which houses birds.
 * @version 1.0
 * @since 2018-11-16
 */
public class Aviary {
    private List<Bird> birds;

    /**
     * Creates a new empty aviary.
     */
    public Aviary() {
        this.birds = new ArrayList<>();
    }

    /**
     * Gets the birds in this aviary.
     * @return The list of birds in this aviary.
     */
    public List<Bird> getBirds() {
        return birds;
    }

    /**
     * Adds a bird to this aviary.
     * @param bird The bird to add.
     */
    public void addBird(Bird bird) {
        birds.add(bird);
    }

    @Override
    public String toString() {
        return "Aviary{" + "birds=" + birds + '}';
    }

    /**
     * Gets the location of this aviary.
     * @return The location of this aviary.
     */
    public String getLocation() {
        return super.toString();
    }
}