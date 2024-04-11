package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class US_606_MertStepDefinitions {
    LeftNav_Mert lfm = new LeftNav_Mert();
    DialogContent_Mert dcm = new DialogContent_Mert();

    @And("User must enter the amount of money")
    public void userMustEnterTheAmountOfMoney(DataTable amount) {
        List<String> amountList = amount.asList(String.class);

        for (int i = 0; i < amountList.size(); i++) {
            WebElement amountValue = dcm.getWebElement(amountList.get(i));
            dcm.mySendKeys(amountValue, "735");
        }
    }

    @And("Money transfer must be successfull")
    public void moneyTransferMustBeSuccessfull() {
        for (int i = 0; i <dcm.text.size() ; i++) {
            Assert.assertEquals(dcm.text.get(i).getText(),"$735.00");
            Assert.assertEquals(dcm.text.get(i).getText(),"20115");
            Assert.assertEquals(dcm.text.get(i).getText(),"20892");

        }
    }
}
