package tests;

import com.codeborne.selenide.Selenide;
import contants.SteamUrls;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {

    @BeforeEach
    public void setUp() {
        Selenide.open(SteamUrls.BASE_URL.getBaseUrl());
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
