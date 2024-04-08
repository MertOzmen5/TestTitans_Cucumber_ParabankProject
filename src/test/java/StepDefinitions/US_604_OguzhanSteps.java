package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentMembershipDictionary;
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
        List<String> butonlarList = accountButonlari.asList(String.class);

        for (int i = 0; i < butonlarList.size(); i++) {
            WebElement webElement = dc.getWebElement(butonlarList.get(i));
            dc.verifyContainsText(dc.minimumDepositedAssert, "A minimum of $1.000,00 must be deposited into this account at time of opening. Please choose an existing account to transfer funds into the new account.");
//            dc.myClick(dc.checking);
//            Select checkingSelect=new Select(dc.accountIdSelect);
//            checkingSelect.s
            dc.myClick(dc.openNewAccountButton);


        }
    }

    @And("Create Account Successfully")
    public void createAccountSuccessfully(DataTable accountGiris) {
       List<String> accountGirisList=accountGiris.asList(String.class);
        for (int i = 0; i < accountGirisList.size(); i++) {
            WebElement webElement=dc.getWebElement(accountGirisList.get(i));
            dc.myClick(dc.accountSuccessfully);
            dc.myClick(dc.newAccountNumber);
            dc.myClick(dc.accountPage);
            ln.myClick(ln.logo);

        }
    }

    @And("Click On The Open New Account Again")
    public void clickOnTheOpenNewAccountAgain(DataTable kategoriler2) {
        List<String> kategorilerList2 = kategoriler2.asList(String.class);
        for (int i = 0; i < kategorilerList2.size(); i++) {
            WebElement webElement = ln.getWebElement(kategorilerList2.get(i));
            ln.myClick(ln.openNewAccount2);


        }
    }

    @And("Select The Account Type Again")
    public void selectTheAccountTypeAgain(DataTable butonlar2) {
        List<String> butonlarList2 = butonlar2.asList(String.class);
        for (int i = 0; i < butonlarList2.size(); i++) {
            WebElement webElement = dc.getWebElement(butonlarList2.get(i));
            dc.myClick(dc.savings);
            dc.myClick(dc.accountIdSelect);
        }
    }

    @And("Create Account Successfully Again")
    public void createAccountSuccessfullyAgain(DataTable accountGiris2) {
        List<String> accountGirisList2 = accountGiris2.asList(String.class);
        for (int i = 0; i < accountGirisList2.size(); i++) {
            WebElement webElement = dc.getWebElement(accountGirisList2.get(i));
            dc.myClick(dc.accountSuccessfully);
            dc.myClick(dc.newAccountNumber);
            dc.myClick(dc.accountPage);
        }
    }
}
