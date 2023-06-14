package category.Aviary;

import category.Bird.Bird;
import category.Bird.Prey.Eagle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AviaryTest {
    private Aviary aviary;
    private Bird bird;

    @Before
    public void setUp() {
        aviary = new Aviary();
        bird = new Eagle();
    }

    @Test
    public void testAddBird() {
        aviary.addBird(bird);
        assertEquals(1, aviary.getBirds().size());
        assertTrue(aviary.getBirds().contains(bird));
    }

    @Test
    public void testToString() {
        aviary.addBird(bird);
        String expected = "Aviary{birds=[EAGLE]}";
        assertEquals(expected, aviary.toString());
    }

    @Test
    public void testGetLocation() {
        aviary.addBird(bird);
//        print the memory address of the object
        String expected =  aviary.getClass().getName() + "@" + Integer.toHexString(aviary.hashCode());
        assertEquals(expected, aviary.getLocation());
    }
}
