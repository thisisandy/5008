package category.Bird;

import category.Bird.Prey.Hawk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdDescriptorTest {

    @Test
    void describe_BirdGiven_ShouldReturnCorrectDescription() {
        Bird bird = new Hawk();

        BirdDescriptor descriptor = new BirdDescriptor();
        String expected = "This is a HAWK and it has 2 wings. It likes to eat [OTHER_BIRDS].";
        assertEquals(expected, descriptor.describe(bird));
    }
}
