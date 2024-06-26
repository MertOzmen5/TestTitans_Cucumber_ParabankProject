package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Oguzhan extends ParentPage {

    public DialogContent_Oguzhan() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='error']")
    public WebElement loginError;
    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement loginSuccess;
    @FindBy(xpath = "//select[@id='type']//following::b")
    public WebElement minimumDepositedAssert;
    @FindBy(css = "[value='0']")
    public WebElement checking;
    @FindBy(css = "[value='1']")
    public WebElement savings;
    @FindBy(css = "div[id='rightPanel'] select:nth-child(2)")
    public WebElement select;
    @FindBy(css = "[value='Open New Account']")
    public WebElement openNewAccountButton;
    @FindBy(css = "[id='fromAccountId']")
    public WebElement accountIdSelect;
    @FindBy(css = "[class='title']+p")
    public WebElement accountSuccessfully;
    @FindBy(css = "[id='newAccountId']")
    public WebElement newAccountNumber;
    @FindBy(xpath = "//td[text()='Account Number:']")
    public WebElement accountPage;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;
    @FindBy(css = "[class='logo']")
    public WebElement logo;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "loginError":
                return this.loginError;
            case "loginSuccess":
                return this.loginSuccess;
            case "minimumDepositedAssert":
                return this.minimumDepositedAssert;
            case "checking":
                return this.checking;
            case "savings":
                return this.savings;
            case "accountIdSelect":
                return this.accountIdSelect;
            case "openNewAccountButton":
                return this.openNewAccountButton;
            case "accountSuccessfully":
                return this.accountSuccessfully;
            case "newAccountNumber":
                return this.newAccountNumber;
            case "accountPage":
                return this.accountPage;
            case "openNewAccount":
                return this.openNewAccount;
            case "logo":
                return this.logo;


        }
        return null;
    }


}
