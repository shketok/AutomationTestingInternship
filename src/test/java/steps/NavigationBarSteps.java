package steps;


import io.cucumber.java.en.When;
import page.objects.NavigationBarPage;

public class NavigationBarSteps {
    private NavigationBarPage navigationBarPage = new NavigationBarPage();

    @When("Go to the specific genre page")
    public void goToSpecificGenre() {
        String param = (String) BaseSteps.container.get("param1");
        navigationBarPage.clickGenreTab();
        navigationBarPage.clickSpecificGenre();
    }
}
