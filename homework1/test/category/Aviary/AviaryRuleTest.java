package category.Aviary;

import category.Bird.Bird;
import category.Bird.Flightless.Emus;
import category.Bird.Flightless.Kiwi;
import category.Bird.Flightless.moa;
import category.Bird.Prey.Eagle;
import category.Bird.Prey.Hawk;
import category.Bird.Waterfowl.Duck;
import category.Bird.Waterfowl.Geese;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AviaryRuleTest {

    private Aviary aviary;
    private Bird bird1, bird2, bird3, bird4, bird5;

    @BeforeEach
    public void setup() {
        aviary = new Aviary();
        bird1 = new Eagle();
        bird2 = new Hawk();
        bird3 = new Kiwi();
        bird4 = new Emus();
        bird5 = new moa();
    }

    @Test
    void canRescueBird() {
        aviary.addBird(bird1);
        assertTrue(AviaryRule.canRescueBird(aviary, bird2));
        aviary.addBird(bird2);
        assertFalse(AviaryRule.canRescueBird(aviary, bird3));
    }

    @Test
    void hasSpace() {
        aviary.addBird(bird1);
        aviary.addBird(bird2);
        assertTrue(AviaryRule.canRescueBird(aviary, bird2));
        aviary.addBird(bird3);
        aviary.addBird(bird4);
        aviary.addBird(bird5);
        assertFalse(AviaryRule.canRescueBird(aviary, new Duck()));
    }

    @Test
    void isCompatible() {
        aviary.addBird(bird1);
        aviary.addBird(bird2);

        assertFalse(AviaryRule.canRescueBird(aviary, new Geese()));
    }
}
