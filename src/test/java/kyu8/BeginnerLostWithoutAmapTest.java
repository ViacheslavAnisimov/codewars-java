package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class BeginnerLostWithoutAmapTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, BeginnerLostWithoutAmap.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, BeginnerLostWithoutAmap.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, BeginnerLostWithoutAmap.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}
