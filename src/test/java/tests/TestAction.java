package tests;

import framework.Browser;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.objects.CategoryPage;
import page.objects.NavigationBarPage;

public class TestAction extends BaseTestPaint {

    @Test
    public void testAction() {
        Actions actions = new Actions(Browser.getInstance().getWebDriver());

        WebElement webElement = Browser.getInstance().getWebDriver().findElement(By.xpath("//canvas[@class='main-canvas']/following-sibling::div[3]"));


        WebDriverWait pageHeaderWait = new WebDriverWait(Browser.getInstance().getWebDriver(), 10, 300);
        pageHeaderWait.until(ExpectedConditions.visibilityOf(webElement));

        actions
                .moveToElement(webElement, 100, 100)
                .clickAndHold()
                .moveToElement(webElement, 100, 200)
                .moveToElement(webElement, 200, 200)
                .moveToElement(webElement, 200, 100)
                .moveToElement(webElement, 100, 100)
                .release()
                .build()
                .perform();

        System.out.println();
    }
}
