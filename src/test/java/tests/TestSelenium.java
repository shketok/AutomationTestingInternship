package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.CategoryPage;
import page.objects.NavigationBarPage;

import java.util.concurrent.TimeUnit;

public class TestSelenium {
    private WebDriver webDriver;
    private static final String AUTOMATION_PRACTICE_URL = "https://store.steampowered.com/";

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        webDriver = new ChromeDriver();


        webDriver.get(AUTOMATION_PRACTICE_URL);

        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }


    @Test
    public void testSelenium() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(webDriver);
        CategoryPage categoryPage = new CategoryPage(webDriver);

        navigationBarPage.clickGenreTab();
        navigationBarPage.clickSpecificGenre();

        categoryPage.waitUntilPageHeaderVisible();
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
