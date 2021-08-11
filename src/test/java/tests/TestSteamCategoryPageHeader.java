package tests;

import org.junit.jupiter.api.Test;
import page.objects.CategoryPage;
import page.objects.NavigationBarPage;

public class TestSteamCategoryPageHeader extends BaseTest {

    @Test
    public void testSteamCategoryPageHeader() {
        NavigationBarPage navigationBarPage = new NavigationBarPage();
        CategoryPage categoryPage = new CategoryPage();

        navigationBarPage.clickGenreTab();
        navigationBarPage.clickSpecificGenre();

        categoryPage.waitUntilPageHeaderVisible();
    }
}
