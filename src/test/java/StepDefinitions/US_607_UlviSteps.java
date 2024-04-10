package StepDefinitions;

import Pages.DialogContent_Ulvi;
import Pages.LeftNav_Ulvi;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;

public class US_607_UlviSteps {
    DialogContent_Ulvi dcu = new DialogContent_Ulvi();
    LeftNav_Ulvi lnu = new LeftNav_Ulvi();

    @Given("Navigate to Parabank website")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Enter username and password and click on login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        lnu.mySendKeys(lnu.username, "testTitans7");
        lnu.mySendKeys(lnu.password, "9517536");
        lnu.myClick(lnu.loginBtn);
    }

    @Then("User should login successfully")
    public void userShouldBeLoginSuccessfully() {
        dcu.verifyContainsText(dcu.loginSuccess, "Welcome");
    }
}

