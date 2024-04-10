package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Zehra extends ParentPage{
    public DialogContent_Zehra() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;

    @FindBy(css = "[name='payee.address.street']")
    public WebElement address;
    @FindBy(css = "[name='payee.address.city']")
    public WebElement city;
    @FindBy(css = "[name='payee.address.state']")
    public WebElement state;
    @FindBy(css = "[name='payee.address.zipCode']")
    public WebElement zipCode;
    @FindBy(css = "[name='payee.phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(css = "[name='payee.accountNumber']")
    public WebElement accountNo;
    @FindBy(css = "[name='verifyAccount']")
    public WebElement verifyAccount;
    @FindBy(css = "[name='amount']")
    public WebElement amount;
    @FindBy(css = "[value='Send Payment']")
    public WebElement sendPayment;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "payeeName":
                return this.payeeName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipCode":
                return this.zipCode;
            case "phoneNumber":
                return this.phoneNumber;
            case "accountNo":
                return this.accountNo;
            case "verifyAccount":
                return this.verifyAccount;
            case "amount":
                return this.amount;
            case "sendPayment":
                return this.sendPayment;
        }

        return null;
    }

}
