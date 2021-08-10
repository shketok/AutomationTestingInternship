package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    private WebDriver webDriver;
    private static final String AUTOMATION_PRACTICE_URL = "http://automationpractice.com/index.php";

    private static final String WOMEN_BUTTON_LOC = "//div[@id='block_top_menu']//a[@title='Women']";
    private static final String WOMEN_CATALOG_TITLE_SELECTOR = "span.cat-name";

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(AUTOMATION_PRACTICE_URL);
    }


    @Test
    public void testSelenium() {
        WebElement webElement = webDriver.findElement(By.xpath(WOMEN_BUTTON_LOC));
        webElement.click();

        WebElement titleCatalog = webDriver.findElement(By.cssSelector(WOMEN_CATALOG_TITLE_SELECTOR));
        String titleText = titleCatalog.getText();

        Assertions.assertTrue(titleText.toLowerCase().contains("women"));
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
