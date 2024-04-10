package StepDefinitions;

import Pages.DialogContent_Ulvi;
import Pages.LeftNav_Ulvi;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    @Given("Navigate to Update Contact Info page")
    public void navigateToUpdateContactInfoPage(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = lnu.getWebElement(strLinkList.get(i));
            lnu.myClick(linkWebElement);
        }
    }

    @When("Enter new information in the relevant fields and click on update button")
    public void enterNewInformationInTheRelevantFieldsAndClickOnUpdateButton(DataTable textBoxAndTexts) {
        List<List<String>> listTxtYazi = textBoxAndTexts.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = dcu.getWebElement(listTxtYazi.get(i).get(0));
            dcu.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
    }

    @Then("User should successfully update the contact information")
    public void userShouldSuccessfullyUpdateTheContactInformation(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = dcu.getWebElement(strButtonsList.get(i));
            dcu.myClick(linkWebElement);
        }

    }

    @Given("Delete at least three options from the contact information")
    public void deleteAtLeastThreeOptionsFromTheContactInformation() {
        dcu.mySendKeys(dcu.firstName, " ");
        dcu.mySendKeys(dcu.lastName, " ");
        dcu.mySendKeys(dcu.address, " ");
    }

    @When("User should successfully confirm the warning message")
    public void userShouldSuccessfullyConfirmTheWarningMessage(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            //System.out.println(strLinkList.get(0));
            WebElement linkWebElement = dcu.getWebElement(strButtonsList.get(i));
            dcu.myClick(linkWebElement);
        }
        }
    }


