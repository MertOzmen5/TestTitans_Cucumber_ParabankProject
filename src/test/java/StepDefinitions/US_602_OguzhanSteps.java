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

    @When("Enter wrong username {string} and password {string} and click login button")
    public void enterWrongUsernameAndPasswordAndClickLoginButton(String username, String password) {
        ln.mySendKeys(ln.username,username);
        ln.mySendKeys(ln.password,password);
        ln.myClick(ln.loginButton);

    }
//    @Then("User should be not login successfully")
//    public void userShouldBeNotLoginSuccessfully() {
//        dc.verifyContainsText(dc.loginError,"An internal error has occurred and has been logged.");
//    }

    @When("Enter username {string} and password {string} and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(String username1, String password1) {
        ln.mySendKeys(ln.username,username1);
        ln.mySendKeys(ln.password,password1);
        ln.myClick(ln.loginButton);
    }

//    @Then("User should be login successfully")
//    public void userShouldBeLoginSuccessfully() {
//        dc.verifyContainsText(dc.loginSuccess,"Welcome");
//    }
}

