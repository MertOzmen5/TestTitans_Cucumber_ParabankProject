package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;



import java.util.List;

public class US_604_OguzhanSteps {

    LeftNav_Oguzhan ln = new LeftNav_Oguzhan();
    DialogContent_Oguzhan dc = new DialogContent_Oguzhan();


    @When("Click On The Open New Account")
    public void clickOnTheOpenNewAccount(DataTable kategoriler) {
        List<String> kategorilerList = kategoriler.asList(String.class);

        for (int i = 0; i < kategorilerList.size(); i++) {
            WebElement webElement = dc.getWebElement(kategorilerList.get(i));
            dc.myClick(webElement);

        }

    }

    @Then("Select The Account Type")
    public void selectTheAccountType(DataTable accountButonlari) {
        List<String> accountButonlariList = accountButonlari.asList(String.class);
        for (int i = 0; i < accountButonlariList.size(); i++) {
            WebElement webElement = dc.getWebElement(accountButonlariList.get(i));
            dc.myClick(webElement);
            dc.verifyContainsText(dc.minimumDepositedAssert, "$100,00");
            dc.myClick(webElement);
            dc.myClick(webElement);


        }

    }

    @Then("Success Message Should Be Displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.accountSuccessfully, "Congratulations, your account is now open.");
    }


    @And("Account Successfully")
    public void accountSuccessfully(DataTable accountControl) {
        List<String> accountControlList = accountControl.asList(String.class);
        for (int i = 0; i < accountControlList.size(); i++) {
            WebElement webElement = dc.getWebElement(accountControlList.get(i));
            dc.myClick(webElement);
            dc.verifyContainsText(dc.accountPage, "Account Number:");
            GWD.getDriver().navigate().back();

        }
    }

    @And("Select The Account Type Again")
    public void selectTheAccountTypeAgain(DataTable accountButonlari2) {
        List<String> accountButonlariList2 = accountButonlari2.asList(String.class);
        for (int i = 0; i < accountButonlariList2.size(); i++) {
            WebElement webElement = dc.getWebElement(accountButonlariList2.get(i));
            dc.myClick(webElement);
            dc.myClick(webElement);

        }
    }

    @And("Create Account Successfully Again")
    public void createAccountSuccessfullyAgain(DataTable accountControl2) {
        List<String> accountControlList2 = accountControl2.asList(String.class);
        for (int i = 0; i < accountControlList2.size(); i++) {
            WebElement webElement = dc.getWebElement(accountControlList2.get(i));
            dc.myClick(webElement);

        }
    }


    @And("Success Account Page Control Should Be Displayed")
    public void successAccountPageControlShouldBeDisplayed() {
        dc.verifyContainsText(dc.accountPage, "Account Number:");
    }
}
