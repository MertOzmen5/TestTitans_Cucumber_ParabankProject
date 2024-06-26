package StepDefinitions;

import Pages.DialogContent_Mert;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class US_606_MertStepDefinitions {
    DialogContent_Mert dcm = new DialogContent_Mert();
    int money1 = (int) (Math.random() * 800);
    String strMoney1 = String.valueOf(money1);

    @And("User must enter the amount of money")
    public void userMustEnterTheAmountOfMoney(DataTable amount) {

        List<String> amountList = amount.asList(String.class);

        for (int i = 0; i < amountList.size(); i++) {
            WebElement amountValue = dcm.getWebElement(amountList.get(i));
            dcm.mySendKeys(amountValue, strMoney1);
        }
    }

    @And("Money transfer must be successfully")
    public void moneyTransferMustBeSuccessfully() {
        dcm.verifyContainsText(dcm.text, "Transfer Complete");
    }

    @And("Money transfer was successful")
    public void moneyTransferWasSuccessful() {
        dcm.verifyContainsText(dcm.confirmText, "Funds Transfer Sent");
    }

    @And("Click on the Funds Transfer Send")
    public void clickOnTheFundsTransferSend(DataTable buttons) {
        List<String> buttonsList = buttons.asList(String.class);

        for (int i = 0; i < buttonsList.size(); i++) {
            WebElement elementButton = dcm.getWebElement(buttonsList.get(i));
            dcm.myClick(elementButton);
        }
    }
}


