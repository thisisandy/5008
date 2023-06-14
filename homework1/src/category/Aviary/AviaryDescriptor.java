package category.Aviary;
import category.Bird.Bird;
import category.Bird.BirdDescriptor;
import category.Bird.BirdType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Describes an Aviary by providing information about the types and numbers of birds it contains.
 */
public class AviaryDescriptor {
    static private final BirdDescriptor _birdDescriptor_ = new BirdDescriptor();

    /**
     * Generates a description of the given aviary including the types and numbers of birds it contains
     * and interesting information about those birds.
     *
     * @param aviary The aviary to describe.
     * @return A description of the aviary.
     */
    public String describe(Aviary aviary) {
        // Print a sign for any given aviary that gives a description of the birds it houses and any interesting information that it may have about that animal.
        // "This aviary houses # types of birds, including \[number\] of \[bird type\], \[number\] of \[bird type\], and \[number\] of \[bird type\]
        // \[interesting information about the birds in this aviary\]"
        List<Bird> birds = aviary.getBirds();

        // classify birds by types
        Map<BirdType, List<Bird>> birdTypeListMap = new HashMap<>();
        for (Bird bird : birds) {
            BirdType type = bird.getType();
            if (!birdTypeListMap.containsKey(type)) {
                birdTypeListMap.put(type, new ArrayList<>());
            }
            birdTypeListMap.get(type).add(bird);
        }

        StringBuilder output = new StringBuilder();
        output.append("This aviary houses ").append(birdTypeListMap.size()).append(" types of birds, including ");
        for (Map.Entry<BirdType, List<Bird>> entry : birdTypeListMap.entrySet()) {
            output.append(entry.getValue().size()).append(" of ").append(entry.getKey().name()).append(", ");
        }
        output.delete(output.length() - 2, output.length());
        output.append("\n");

        for (Map.Entry<BirdType, List<Bird>> entry : birdTypeListMap.entrySet()) {
            Bird sample = entry.getValue().get(0);
            output.append(_birdDescriptor_.describe(sample)).append("\n");
        }
        return output.toString();
    }
}