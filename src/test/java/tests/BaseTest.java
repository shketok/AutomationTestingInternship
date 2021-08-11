package tests;

import contants.SteamUrls;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=8500,2200");

        webDriver = new ChromeDriver(chromeOptions);

        webDriver.get(SteamUrls.BASE_URL.getBaseUrl());

        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
