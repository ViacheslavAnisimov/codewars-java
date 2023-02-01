package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ThinkfulLogicDrillsTrafficLightTest {
    @Test
    public void update_light() {
        assertEquals("green", ThinkfulLogicDrillsTrafficLight.updateLight("red"));
        assertEquals("yellow", ThinkfulLogicDrillsTrafficLight.updateLight("green"));
        assertEquals("red", ThinkfulLogicDrillsTrafficLight.updateLight("yellow"));
    }
}
