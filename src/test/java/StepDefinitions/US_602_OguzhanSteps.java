package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_602_OguzhanSteps {

    DialogContent_Oguzhan dc=new DialogContent_Oguzhan();
    LeftNav_Oguzhan ln=new LeftNav_Oguzhan();


    @Given("Navigate to Parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Enter wrong username and password and click login button")
    public void enterWrongUsernameAndPasswordAndClickLoginButton() {
        ln.mySendKeys(ln.username,"null");
        ln.mySendKeys(ln.password,"null");

    }

    @Then("User should be not login successfully")
    public void userShouldBeNotLoginSuccessfully() {
        ln.myClick(ln.loginButton);
        ln.verifyContainsText(dc.loginError,"An internal error has occurred and has been logged.");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    }

}
