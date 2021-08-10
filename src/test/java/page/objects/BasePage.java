package page.objects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
