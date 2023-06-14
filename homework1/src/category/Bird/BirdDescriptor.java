package category.Bird;

/**
 * Generates a description for a given bird.
 */
public class BirdDescriptor {

    /**
     * Generates a description for the given bird including its type, number of wings, and preferred food.
     *
     * @param bird The bird to describe.
     * @return A description of the bird.
     */
    public String describe(Bird bird) {
        return "This is a " + bird.getType() + " and it has "
                + bird.numberOfWings + " wings. It likes to eat "
                + bird.preferredFood + ".";
    }
}