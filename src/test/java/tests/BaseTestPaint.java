package tests;

import contants.SteamUrls;
import framework.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

public class BaseTestPaint {

    @BeforeEach
    public void setUp() {
        Browser browser = Browser.getInstance();

        browser.open("https://jspaint.app/");

        browser.setImplicitWait(0, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        Browser.getInstance().quit();
    }
}
