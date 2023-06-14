package category.Aviary;

import category.Bird.Prey.Eagle;
import category.Bird.Prey.Hawk;
import category.Bird.Prey.Osprey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AviaryDescriptorTest {
    private Aviary aviary;
    private AviaryDescriptor aviaryDescriptor;

    @BeforeEach
    void setUp() {
        aviary = new Aviary();
        aviaryDescriptor = new AviaryDescriptor();
    }

    @Test
    void describe() {
        aviary.addBird(new Eagle());
        aviary.addBird(new Hawk());
        aviary.addBird(new Osprey());
        String description = aviaryDescriptor.describe(aviary);
        assertNotNull(description);
        assertTrue(description.contains("This aviary houses 3 types of birds"));
    }
}