package StepDefinitions;

import Pages.DialogContent_Asli;
import Pages.LeftNav_Asli;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_608_AsliStepDefinitins {

    DialogContent_Asli dc = new DialogContent_Asli();
    LeftNav_Asli ln = new LeftNav_Asli();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        ln.mySendKeys(ln.username, "testTitans7");
        ln.mySendKeys(ln.password, "9517536");
        ln.myClick(ln.loginButton);


    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable textBoxVeYazilar) {

        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc.getWebElement(listTxtYazi.get(i).get(0));
            txtBoxWebElemnt.clear();
            dc.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));


        }

    }

    @Then("User should see loan approved message")
    public void userShouldSeeLoanApprovedMessage() {
        dc.verifyContainsText(dc.loanApproved, "approved");

    }


    @Then("User Should see no transaction message")
    public void userShouldSeeNoTransactionMessage() {

        dc.verifyContainsText(dc.noTranscation, "No transactions found.");

    }
}