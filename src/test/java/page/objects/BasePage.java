package page.objects;

import framework.Browser;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = Browser.getInstance().getWebDriver();
    }
}
