package tests;

import org.junit.jupiter.api.Test;
import page.objects.CategoryPage;
import page.objects.NavigationBarPage;

public class TestSteamCategoryPageHeader extends BaseTest {

    @Test
    public void testSteamCategoryPageHeader() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(webDriver);
        CategoryPage categoryPage = new CategoryPage(webDriver);

        navigationBarPage.clickGenreTab();
        navigationBarPage.clickSpecificGenre();

        categoryPage.waitUntilPageHeaderVisible();
    }
}
