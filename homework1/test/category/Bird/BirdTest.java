package category.Bird;

import category.Bird.Prey.Eagle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {
    private Bird bird;

    @Test
    void getType() {
        bird = new Eagle();
        assertEquals(BirdType.EAGLE, bird.getType());
    }

    @Test
    void getDefiningCharacteristic() {
        bird = new Eagle();
        assertNotNull(bird.getDefiningCharacteristic());
    }

    @Test
    void getNumberOfWings() {
        bird = new Eagle();
        assertEquals(2, bird.getNumberOfWings());
    }

    @Test
    void getPreferredFood() {
        bird = new Eagle();
        assertNull(bird.getPreferredFood());
    }
}
