package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pen.Pen;

public class TestPenWrite extends BaseTest {

    @Test
    public void testPenWriteWordSizeLessThanInkCounter() {
        Pen pen = new Pen();
        String expectedResult = "Hello, world";
        String actualResult = pen.write("Hello, world");
        Assert.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
                expectedResult, actualResult);
    }

    @Test
    public void testPenWriteWordNegative() {
        Pen pen = new Pen();
        String expectedResult = "Putin123";
        try {
            String actualResult = pen.write(expectedResult);
            Assert.assertTrue(false);
        } catch (RuntimeException ex) {
            Assert.assertTrue(true);
        }
    }
}
