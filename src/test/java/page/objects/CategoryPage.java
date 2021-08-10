package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage extends BasePage {
    private static final String PAGE_HEADER_LOC = "//*[@class='pageheader']";

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void waitUntilPageHeaderVisible() {
        WebDriverWait pageHeaderWait = new WebDriverWait(webDriver, 10, 300);
        WebElement pageHeader = webDriver.findElement(By.xpath(PAGE_HEADER_LOC));
        pageHeaderWait.until(ExpectedConditions.visibilityOf(pageHeader));
    }


}
