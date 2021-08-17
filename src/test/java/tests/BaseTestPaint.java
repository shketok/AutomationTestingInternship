package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestPaint {

    @BeforeEach
    public void setUp() {
        Selenide.open("https://jspaint.app/");
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
