package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavigationBarPage {
    private SelenideElement genreTab = $("#genre_tab");
    private SelenideElement rpgPartyBased = $x("//a[@class='popup_menu_item' and contains(@href, 'rpg_party_based')]");


    public void clickGenreTab() {
        genreTab.click();
    }

    public void clickSpecificGenre() {
        rpgPartyBased.click();
    }
}
