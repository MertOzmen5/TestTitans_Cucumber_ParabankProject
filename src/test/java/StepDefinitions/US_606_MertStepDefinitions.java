package StepDefinitions;

import Pages.DialogContent_Mert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class US_606_MertStepDefinitions {
    public WebElement FundsTransferSend;
    DialogContent_Mert dcm = new DialogContent_Mert();
    int money1=(int)(Math.random()*800);
    String strMoney1=String.valueOf(money1);

    @And("User must enter the amount of money")
    public void userMustEnterTheAmountOfMoney(DataTable amount) {

        List<String> amountList = amount.asList(String.class);

        for (int i = 0; i < amountList.size(); i++) {
            WebElement amountValue = dcm.getWebElement(amountList.get(i));
            dcm.mySendKeys(amountValue,strMoney1);
        }
    }

    @And("Money transfer must be successfully")
    public void moneyTransferMustBeSuccessfully() {
        for (int i = 0; i <dcm.text.size() ; i++) {
            Assert.assertEquals(dcm.text.get(i).getText(),strMoney1);
            Assert.assertEquals(dcm.text.get(i).getText(),"20115");
            Assert.assertEquals(dcm.text.get(i).getText(),"20892");
        }
    }

    @And("Money transfer was successful")
    public void moneyTransferWasSuccessful() {
       Assert.assertEquals(dcm.confirmText.getText(),"$"+strMoney1+",00");
    }

    @And("Click on the Funds Transfer Send")
    public void clickOnTheFundsTransferSend() {
        for (int i = 0; i <dcm.moneyValue.size() ; i++) {
            FundsTransferSend=dcm.moneyValue.get(dcm.moneyValue.size()-1);
            dcm.myClick(FundsTransferSend);
        }
    }
}
