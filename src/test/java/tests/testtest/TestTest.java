package tests.testtest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;
import pen.Pen;
import tests.BaseTest;
import tests.PenGetColorArguments;

public class TestTest extends BaseTest {

    @ParameterizedTest
    @ArgumentsSource(TestTestArguments.class)
    public void testPenGetColorFoo(int numberToCheck, int numberToCompare, String expectedResult) {
        Pen pen = new Pen();
        String result = pen.isNumberGreaterThan(numberToCheck, numberToCompare);
        Assert.assertEquals(expectedResult, result);
    }

}
