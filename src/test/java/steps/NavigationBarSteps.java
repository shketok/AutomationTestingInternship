package steps;


import io.cucumber.java.en.When;
import page.objects.NavigationBarPage;

public class NavigationBarSteps {
    private NavigationBarPage navigationBarPage = new NavigationBarPage();

    @When("Go to the specific genre page")
    public void goToSpecificGenre() {
        navigationBarPage.clickGenreTab();
        navigationBarPage.clickSpecificGenre();
    }
}
