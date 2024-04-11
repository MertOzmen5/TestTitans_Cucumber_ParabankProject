package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Mert extends ParentPage {
    public LeftNav_Mert() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;

    @FindBy (xpath = "//a[text()='Transfer Funds']")
    public WebElement transferFundsButton;

    @FindBy (xpath = "//a[text()='Accounts Overview']")
    public WebElement accountsOverview;

    public WebElement getWebElement(String element) {

        switch (element) {
            case "registerButton":
                return this.registerButton;
            case "transferFundsButton":
                return this.transferFundsButton;
            case "accountsOverview":
                return this.accountsOverview;
        }return null;
    }
}
