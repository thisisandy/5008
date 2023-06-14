package transmission;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaticTransmissionTest {
    private AutomaticTransmission transmission;

    @Before
    public void setUp() {
        transmission = new AutomaticTransmission(10, 20, 30, 40, 50);
    }

    @Test
    public void testIncreaseSpeed() {
        assertEquals(0, transmission.getSpeed());
        transmission.increaseSpeed();
        assertEquals(2, transmission.getSpeed());
        transmission.increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed();
        assertEquals(12, transmission.getSpeed());
    }

    @Test
    public void testDecreaseSpeed() {
        for (int i = 0; i < 5; i++) {
            transmission.increaseSpeed();
        }
        assertEquals(10, transmission.getSpeed());
        transmission.decreaseSpeed();
        assertEquals(8, transmission.getSpeed());
        transmission.decreaseSpeed().decreaseSpeed();
        assertEquals(4, transmission.getSpeed());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecreaseSpeedNegative() {
        transmission.decreaseSpeed();
    }

    @Test
    public void testGetSpeed() {
        assertEquals(0, transmission.getSpeed());
        transmission.increaseSpeed().increaseSpeed();
        assertEquals(4, transmission.getSpeed());
    }

    @Test
    public void testToString() {
        assertEquals("Transmission (speed = 0, gear = 0)", transmission.toString());
        transmission.increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed().increaseSpeed();
        assertEquals("Transmission (speed = 10, gear = 2)", transmission.toString());
        transmission.increaseSpeed().increaseSpeed();
        assertEquals("Transmission (speed = 14, gear = 2)", transmission.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSpeedThresholds() {
        new AutomaticTransmission(-10, 20, 30, 40, 50);
    }
}
