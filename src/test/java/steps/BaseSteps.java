package steps;

import com.codeborne.selenide.Selenide;
import contants.SteamUrls;
import io.cucumber.java.en.Given;

public class BaseSteps {

    @Given("Open the page {string}")
    public void openPage(String url) {
        Selenide.open(SteamUrls.BASE_URL.getBaseUrl());
    }
}
