package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Ulvi extends ParentPage {
    public DialogContent_Ulvi() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement loginSuccess;

    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;

    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy(css = "[value='Update Profile']")
    public WebElement updateProfileBtn;

    @FindBy(xpath = "//*[text()='Profile Updated']")
    public WebElement updateProfileSuccess;

    @FindBy(xpath = "//*[@class='error ng-scope']")
    public WebElement updateProfileFail;

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
            case "phoneInput":
                return this.phone;
            case "updateProfileBtn":
                return this.updateProfileBtn;
            case "updateProfileSuccess":
                return this.updateProfileSuccess;
            case "updateProfileFail":
                return this.updateProfileFail;
        }
        return null;
    }
}
