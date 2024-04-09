package StepDefinitions;


import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import javax.xml.crypto.Data;
import java.util.List;

public class US_601_MertStepDefinitions {
    LeftNav_Mert lfm=new LeftNav_Mert();
    DialogContent_Mert dcm=new DialogContent_Mert();
    @When("Click the register button")
    public void clickTheRegisterButton() {
        lfm.myClick(lfm.registerButton);
    }

    @Then("Fill in Registration information as a user and click the register button")
    public void fillInRegistrationInformationAsAUserAndClickTheRegisterButton(DataTable textAndKeys) {
        List<List<String>> listText=textAndKeys.asLists(String.class);

        for (int i = 0; i < listText.size() ; i++) {
            WebElement textElement= dcm.getWebElement(listText.get(i).get(0));
            dcm.mySendKeys(textElement,listText.get(i).get(1));
        }
    }
    @And("User should be register successfullied")
    public void userShouldBeLoginSuccessfullied() {
    }

}
