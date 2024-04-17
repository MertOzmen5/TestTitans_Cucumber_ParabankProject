package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Asli extends ParentPage{
    public LeftNav_Asli() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement username;

    @FindBy(css = "[name='password']")
    public WebElement password;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/parabank/requestloan.htm']")
    public WebElement requestLoan;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "requestLoan": return this.requestLoan;

        }

        return null;
    }
}
