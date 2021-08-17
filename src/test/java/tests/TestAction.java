package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

public class TestAction extends BaseTestPaint {

    @Test
    public void testAction() {
        SelenideElement selenideElement = $x("//canvas[@class='main-canvas']/following-sibling::div[3]");

        Selenide.actions()
                .moveToElement(selenideElement, 100, 100)
                .clickAndHold()
                .moveToElement(selenideElement, 100, 200)
                .moveToElement(selenideElement, 200, 200)
                .moveToElement(selenideElement, 200, 100)
                .moveToElement(selenideElement, 100, 100)
                .release()
                .build()
                .perform();
    }
}
