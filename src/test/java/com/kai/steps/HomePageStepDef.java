package com.kai.steps;
import com.kai.page.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I Click on Cookies Accept & Close$")
    public void iClickOnCookiesAcceptClose() {
        new HomePage().clickonAcceptandClose();
    }

    @And("^I click on Header \"([^\"]*)\"$")
    public void iClickOnHeader(String hmenuu)  {
        new HomePage().clickonHeaderMenu(hmenuu);

    }

    @Then("^I navigate to a Header Menu Page$")
    public void iNavigateToAHeaderMenuPage() {

    }
}
