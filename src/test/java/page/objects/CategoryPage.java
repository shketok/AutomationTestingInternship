package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CategoryPage {
    private SelenideElement pageHeader = $x("//*[@class='pageheader']");

    public void waitUntilPageHeaderVisible() {
        pageHeader.shouldBe(Condition.visible);
    }


}
