package tests;

import contants.SteamUrls;
import framework.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        Browser browser = Browser.getInstance();

        browser.open(SteamUrls.BASE_URL.getBaseUrl());

        browser.setImplicitWait(0, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        Browser.getInstance().quit();
    }
}
