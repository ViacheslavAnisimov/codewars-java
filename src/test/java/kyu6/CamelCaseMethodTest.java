package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CamelCaseMethodTest {
    CamelCaseMethod Solution = new CamelCaseMethod();
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", Solution.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", Solution.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", Solution.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", Solution.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", Solution.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", Solution.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", Solution.camelCase(""));
    }
}
