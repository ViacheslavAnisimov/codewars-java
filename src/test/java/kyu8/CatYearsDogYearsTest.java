package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class CatYearsDogYearsTest {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, CatYearsDogYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, CatYearsDogYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, CatYearsDogYears.humanYearsCatYearsDogYears(10));
    }
}
