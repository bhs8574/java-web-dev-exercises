package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestComputer {

    Computer computer1;
    Computer computer2;

    @Before
    public void createComputer() {
        computer1 = new Computer(4, 2, "Computer 1");
        computer2 = new Computer(4, 2, "Computer 2");
    }

    @Test
    public void testSequentialId() {
        assertEquals(computer1.getId(), computer2.getId()-1);
    }

    @Test
    public void testAddRam() {
        computer1.addRam(4);
        assertEquals(computer1.getGbRam(), 8);
    }

    @Test
    public void testAddStorage() {
        computer2.addStorage(2);
        assertEquals(computer2.getTbStorage(), 4);
    }
}
