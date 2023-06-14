package category.Conservatory;

import category.Bird.Bird;
import category.Bird.Parrot.GrayParrot;
import category.Bird.Prey.Eagle;
import category.Bird.Waterfowl.Duck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConservatoryTest {
    Conservatory conservatory;

    @BeforeEach
    void setup() {
        conservatory = new Conservatory();
    }

    @Test
    void testRescueBird_Success() {
        // Try rescuing a bird when there is space in an aviary
        Bird bird = new Eagle();
        boolean success = conservatory.rescueBird(bird);

        assertTrue(success);
        assertEquals(1, conservatory.getNumberOfBirds());
        assertEquals(1, conservatory.getAviaryOfBird(bird).getBirds().size());
    }

    @Test
    void testRescueBird_NoSpace_CreateNewAviary() {
        // Try rescuing when no aviary has space but we can create a new one
        Bird bird1 = new Eagle();
        Bird bird2 = new Duck();
        Bird bird3 = new GrayParrot(10, "Hello");

        boolean success1 = conservatory.rescueBird(bird1);
        boolean success2 = conservatory.rescueBird(bird2);
        boolean success3 = conservatory.rescueBird(bird3);

        assertAll(
                () -> assertTrue(success1),
                () -> assertTrue(success2),
                () -> assertTrue(success3),
                () -> assertEquals(3, conservatory.getNumberOfBirds()),
                () -> assertEquals(2, conservatory.getNumberOfAviaries())
        );
    }

    @Test
    void testRescueBird_NoSpace_AviaryFull() {
        // Try rescuing when aviary is already full
        Eagle eagle = new Eagle();
        for (int i = 0; i < Conservatory.maxAviaries*5; i++) {
            eagle = new Eagle();
            conservatory.rescueBird(eagle);
        }
        Bird bird6 = new Duck();
        boolean success = conservatory.rescueBird(bird6);

        assertFalse(success);
        assertEquals(101, conservatory.getNumberOfBirds());
        assertEquals(20, conservatory.getNumberOfAviaries());
        assertEquals(5, conservatory.getAviaryOfBird(eagle).getBirds().size());
    }
}