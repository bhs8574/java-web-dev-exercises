package exercises.technology.test;


import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSmartPhone {
    SmartPhone smartPhone1;

    @Before
    public void createSmartPhone() {
        smartPhone1 = new SmartPhone(4, 2, "SmartPhone 1");
    }

    @Test
    public void testToSeeIfDataIsSetInConstructor() {
        assertEquals(smartPhone1.getDataUsed(), 0, 0);
    }

    @Test
    public void testUpdateDataUsed() {
        smartPhone1.updateDataUsed(10);
        assertEquals(smartPhone1.getDataUsed(), 10, .001);
    }

    @Test
    public void testResetDataUsed() {
        smartPhone1.updateDataUsed(10);
        assertEquals(smartPhone1.getDataUsed(), 10,.001);
        smartPhone1.resetDataUsed();
        assertEquals(smartPhone1.getDataUsed(), 0, 0);
    }

}
