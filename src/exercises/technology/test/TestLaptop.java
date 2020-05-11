package exercises.technology.test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLaptop {

    Laptop laptop1;

    @Before
    public void createLaptop() {
        laptop1 = new Laptop(4, 2, "Laptop 1");
    }

    @Test
    public void testToggleWiFi() {
        assertFalse(laptop1.isWiFiOn());
        laptop1.toggleWiFi();
        assertTrue(laptop1.isWiFiOn());
        laptop1.toggleWiFi();
        assertFalse(laptop1.isWiFiOn());
    }

    @Test
    public void testWiFiStatusOff() {
        assertEquals(laptop1.wiFiStatus(), "Off");
    }

    @Test
    public void testWiFiStatusOn() {
        laptop1.toggleWiFi();
        assertEquals(laptop1.wiFiStatus(), "On");
    }
}
