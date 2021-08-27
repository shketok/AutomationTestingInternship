package steps;

import io.cucumber.java.en.Then;
import page.objects.CategoryPage;

public class CategoryPageSteps {

    private CategoryPage categoryPage = new CategoryPage();

    @Then("Check that header visible")
    public void waitUntilPageHeaderVisible() {
        categoryPage.waitUntilPageHeaderVisible();
    }
}
