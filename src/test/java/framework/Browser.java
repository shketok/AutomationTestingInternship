package framework;

import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static Browser browser;
    private WebDriver webDriver;
    private BrowserFactory browserFactory = new BrowserFactory();

    private Browser() {
        webDriver = browserFactory.getWebDriver("chrome");
    }

    public static Browser getInstance() {
        if (browser == null) {
            browser = new Browser();
        }
        return browser;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void setImplicitWait(long time, TimeUnit timeUnit) {
        webDriver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public void quit() {
        Browser.getInstance().getWebDriver().quit();
        browser = null;
    }
}
