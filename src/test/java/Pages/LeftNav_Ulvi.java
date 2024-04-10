package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Ulvi extends ParentPage {
    {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "[value='Log In']")
    public WebElement loginBtn;
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateInfo;

    public WebElement getWebElement(String element) {
        switch (element) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "loginBtn":
                return this.loginBtn;
            case "updateContactInfo":
                return this.updateInfo;
        }
        return null;
    }

}
