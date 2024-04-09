package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import Pages.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class US_604_OguzhanSteps {

    LeftNav_Oguzhan ln = new LeftNav_Oguzhan();
    DialogContent_Oguzhan dc = new DialogContent_Oguzhan();


    @And("Click On The Open New Account")
    public void clickOnTheOpenNewAccount(DataTable kategoriler) {
        List<String> kategorilerList = kategoriler.asList(String.class);

        for (int i = 0; i < kategorilerList.size(); i++) {
            WebElement webElement = ln.getWebElement(kategorilerList.get(i));
            ln.myClick(ln.openNewAccount);


        }

    }

    @And("Select The Account Type")
    public void selectTheAccountType(DataTable accountButonlari) {
        List<String> accountButonlariList = accountButonlari.asList(String.class);
        for (int i = 0; i < accountButonlariList.size(); i++) {
            WebElement webElement = dc.getWebElement(accountButonlariList.get(i));
            dc.verifyContainsText(dc.minimumDepositedAssert, "$100,00");
//            dc.myClick(dc.checking);
//            dc.myClick(dc.accountIdSelect);
            dc.myClick(dc.openNewAccountButton);


        }

    }

    @And("Success Message Should Be Displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.accountSuccessfully, "Congratulations, your account is now open.");
    }


    @And("Account Successfully")
    public void accountSuccessfully(DataTable accountControl) {
        List<String> accountControlList = accountControl.asList(String.class);
        for (int i = 0; i < accountControlList.size(); i++) {
            WebElement webElement = dc.getWebElement(accountControlList.get(i));
            dc.myClick(dc.newAccountNumber);
            dc.verifyContainsText(dc.accountPage, "Account Number:");
            ln.myClick(ln.logo);
            ln.myJSClick(ln.openNewAccount);
        }
    }

    @And("Select The Account Type Again")
    public void selectTheAccountTypeAgain(DataTable accountButonlari2) {
        List<String> accountButonlariList2 = accountButonlari2.asList(String.class);
        for (int i = 0; i < accountButonlariList2.size(); i++) {
            WebElement webElement = dc.getWebElement(accountButonlariList2.get(i));
            dc.myClick(dc.savings);
            dc.myClick(dc.accountIdSelect);
            dc.myClick(dc.openNewAccountButton);

        }
    }

    @And("Create Account Successfully Again")
    public void createAccountSuccessfullyAgain(DataTable accountControl2) {
        List<String> accountControlList2 = accountControl2.asList(String.class);
        for (int i = 0; i < accountControlList2.size(); i++) {
            WebElement webElement = dc.getWebElement(accountControlList2.get(i));
            dc.myClick(dc.newAccountNumber);
            dc.verifyContainsText(dc.accountPage, "Account Number:");

        }
    }


    @And("Success Account Page Control Should Be Displayed")
    public void successAccountPageControlShouldBeDisplayed() {
        dc.verifyContainsText(dc.accountPage, "Account Number:");
    }
}
