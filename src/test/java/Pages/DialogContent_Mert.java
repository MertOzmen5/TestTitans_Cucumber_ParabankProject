package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_tw.假設;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent_Mert extends ParentPage {
    public DialogContent_Mert() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='customer.ssn']")
    public WebElement ssnNumber;

    @FindBy(xpath = "//input[@name='customer.username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='customer.password']")
    public WebElement password;

    @FindBy(css = "[id='repeatedPassword']")
    public WebElement confirmPassword;

    @FindBy(css = "[value='Register']")
    public WebElement registerBtn;

    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement confirmRegisterMsg;

    @FindBy(css = "[id='toAccountId']")
    public WebElement selectAccountButton;

    @FindBy(css = "[id='toAccountId']>option:nth-child(2)")
    public WebElement transferAccount;

    @FindBy(css = "[id='amount']")
    public WebElement transferAmount;

    @FindBy(css = "[value='Transfer']")
    public WebElement transferButton;

    @FindBy(css = "[class='title']+p>span")
    public List<WebElement> text;

    @FindBy(xpath = "(//tr[@ng-repeat='account in accounts']//a)[1]")
    public WebElement confirmTransfer;

    @FindBy(xpath = "//a[text()='Funds Transfer Sent']")
    public List<WebElement> moneyValue;

    @FindBy(xpath = "(//td[@align='right'])[5]//following::td")
    public WebElement confirmText;


    public WebElement getWebElement(String element) {

        switch (element) {
            case "firstNameInput":
                return this.firstName;
            case "lastNameInput":
                return this.lastName;
            case "addressInput":
                return this.address;
            case "cityInput":
                return this.city;
            case "stateInput":
                return this.state;
            case "zipCodeInput":
                return this.zipCode;
            case "phoneNumberInput":
                return this.phone;
            case "ssnNumberInput":
                return this.ssnNumber;
            case "userNameInput":
                return this.userName;
            case "passwordInput":
                return this.password;
            case "confirmPasswordInput":
                return this.confirmPassword;
            case "confirmRegisterBtn":
                return this.registerBtn;
            case "selectAccountButton":
                return this.selectAccountButton;
            case "transferAccount":
                return this.transferAccount;
            case "transferAmount":
                return this.transferAmount;
            case "transferButton":
                return this.transferButton;
            case "confirmTransfer":
                return this.confirmTransfer;
        }
        return null;
    }
}
