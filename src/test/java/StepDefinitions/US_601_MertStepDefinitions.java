package StepDefinitions;


import Pages.LeftNav_Mert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_601_MertStepDefinitions {
    LeftNav_Mert lfm=new LeftNav_Mert();
    @When("Click the register button")
    public void clickTheRegisterButton() {
        lfm.myClick(lfm.registerButton);
    }

    @Then("Fill in Registration information as a user and click the register button")
    public void fillInRegistrationInformationAsAUserAndClickTheRegisterButton() {
    }

    @And("User should be login successfullied")
    public void userShouldBeLoginSuccessfullied() {
    }
}
