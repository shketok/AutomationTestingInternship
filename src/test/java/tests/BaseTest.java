package tests;

import contants.SteamUrls;
import framework.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        WebDriver webDriver = Browser.getInstance().getWebDriver();

        webDriver.get(SteamUrls.BASE_URL.getBaseUrl());

        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        Browser.getInstance().getWebDriver().quit();
    }
}
