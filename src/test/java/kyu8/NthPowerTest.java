package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class NthPowerTest {
    @Test
    public void basicTests() {
        assertEquals(-1, NthPower.nthPower(new int[] {1,2}, 2));
        assertEquals(8, NthPower.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, NthPower.nthPower(new int[] {3,1,2}, 2));
    }
}
