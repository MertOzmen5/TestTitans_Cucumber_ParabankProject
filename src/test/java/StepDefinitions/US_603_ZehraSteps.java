package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.DialogContent_Zehra;
import Pages.LeftNav_Oguzhan;
import Pages.LeftNav_Zehra;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_603_ZehraSteps {

    LeftNav_Zehra ln = new LeftNav_Zehra();
    DialogContent_Zehra dcz = new DialogContent_Zehra();

    @When("Enter username and password and click login")
    public void enterUsernameAndPasswordAndClickLogin() {
        ln.mySendKeys(ln.username,"zhrgkrl");
        ln.mySendKeys(ln.password,"Z123456");
        ln.myClick(ln.loginButton);
    }

    @When("Click on the Bill Pay")
    public void clickOnTheBillPay(DataTable billPayButton) {
        List<String> billPay=billPayButton.asList(String.class);
        for (int i = 0; i < billPay.size(); i++) {

            WebElement linkWebElement=ln.getWebElement(billPay.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @Then("Enter payee information")
    public void enterPayeeInformation(DataTable textAndKeys) {
        List<List<String>> listText = textAndKeys.asLists(String.class);

        for (int i = 0; i < listText.size(); i++) {
            WebElement textElement = dcz.getWebElement(listText.get(i).get(0));
            dcz.mySendKeys(textElement, listText.get(i).get(1));
        }

    }

    @And("Click on the Send Payment Button")
    public void clickOnTheSendPaymentButton(DataTable buttons) {
        List<String> buttonsList = buttons.asList(String.class);

        for (int i = 0; i < buttonsList.size(); i++) {
            WebElement elementButton = dcz.getWebElement(buttonsList.get(i));
            dcz.myClick(elementButton);

        }
    }
}
