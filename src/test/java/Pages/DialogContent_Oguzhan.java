package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Oguzhan extends ParentPage {

    public DialogContent_Oguzhan() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "//p[@class='error']")
    public WebElement loginError;
    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement loginSuccess;
    @FindBy(xpath = "//b[text()='A minimum of $1.000,00 must be deposited into this account at time of opening. Please choose an existing account to transfer funds into the new account.']")
    public WebElement minimumDepositedAssert;
    @FindBy(xpath = "[value='0']")
    public WebElement checking;
    @FindBy(xpath = "[value='1']")
    public WebElement savings;
    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement accountIdSelect;
    @FindBy(xpath = "//p[text()='Congratulations, your account is now open.']")
    public WebElement accountSuccessfully;
    @FindBy(css = "[id='newAccountId']")
    public WebElement newAccountNumber;
    @FindBy(css = "[id='accountId']")
    public WebElement accountPage;
















}
