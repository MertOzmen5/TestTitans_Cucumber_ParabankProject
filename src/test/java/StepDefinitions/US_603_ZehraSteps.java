package StepDefinitions;

import Pages.LeftNav_Oguzhan;
import Pages.LeftNav_Zehra;
import io.cucumber.java.en.When;

public class US_603_ZehraSteps {
    LeftNav_Oguzhan ln = new LeftNav_Oguzhan();

    @When("Enter username and password and click login")
    public void enterUsernameAndPasswordAndClickLogin() {
        ln.mySendKeys(ln.username,"zhrgkrl");
        ln.mySendKeys(ln.password,"Z123456");
        ln.myClick(ln.loginButton);
    }
}
