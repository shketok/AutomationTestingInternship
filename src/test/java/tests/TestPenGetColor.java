package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;
import pen.Pen;

public class TestPenGetColor extends BaseTest {

    @Test
    public void testPenGetColorBasicColor() {
        Pen pen = new Pen();
        String expectedResult = "BLUE";
        String actualResult = pen.getColor();
        Assert.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
                expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"RED", "BLUE", "YELLOW"})
    public void testPenGetColorRedColor(String expectedResult) {
        Pen pen = new Pen(expectedResult);
        String actualResult = pen.getColor();
        Assert.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
                expectedResult, actualResult);
    }

    @ParameterizedTest
    @ArgumentsSource(PenGetColorArguments.class)
    public void testPenGetColorFoo(String color, int inkCounter) {
        Pen pen = new Pen(color, inkCounter);
        String actualResult = pen.getColor();
        Assert.assertEquals(String.format("Expected %s, actual result %s", color, actualResult),
                color, actualResult);
    }

}
