package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBarPage extends BasePage {
    private static final String GENRE_TAB_SELECTOR = "#genre_tab";
    private static final String RPG_PARTY_BASED_LOC = "//a[@class='popup_menu_item' and contains(@href, 'rpg_party_based')]";

    public NavigationBarPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickGenreTab() {
        WebDriverWait genreTabWait = new WebDriverWait(webDriver, 10, 300);
        WebElement genreTab = webDriver.findElement(By.cssSelector(GENRE_TAB_SELECTOR));
        genreTabWait.until(ExpectedConditions.visibilityOf(genreTab));
        genreTab.click();
    }

    public void clickSpecificGenre() {
        WebDriverWait rpgPartyBasedWait = new WebDriverWait(webDriver, 10, 300);
        WebElement rpgPartyBasedElement = webDriver.findElement(By.xpath(RPG_PARTY_BASED_LOC));
        rpgPartyBasedWait.until(ExpectedConditions.visibilityOf(rpgPartyBasedElement));
        rpgPartyBasedElement.click();
    }
}
